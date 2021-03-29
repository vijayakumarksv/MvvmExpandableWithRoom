package com.developer.gadget.expandablelistsamplewithroom.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.developer.gadget.expandablelistsamplewithroom.data.DataGenerator
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [vPubEntity::class], version = 3, exportSchema = false)

abstract class VPubDatabase : RoomDatabase() {

    abstract fun vpubtDao(): VPubDao

    companion object {
        @Volatile
        private var INSTANCE: VPubDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): VPubDatabase {

            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context, scope).also {
                    INSTANCE = it
                }
            }
        }

        private fun buildDatabase(context: Context, scope: CoroutineScope): VPubDatabase {
            return Room.databaseBuilder(context, VPubDatabase::class.java, "vpub_db")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)

                        scope.launch {
                            INSTANCE?.let {
                                for (vpubentity: vPubEntity in DataGenerator.getVpubDetails()) {
                                    it.vpubtDao().insert(
                                        vPubEntity(
                                            vpubentity.vpubName,
                                            vpubentity.vPubPhoto,
                                            vpubentity.module
                                        )
                                    )
                                }

                            }
                        }

                    }
                }).build()


        }
    }

}