package com.developer.gadget.expandablelistsamplewithroom.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubEntity

@Dao
interface VPubDao {
    @Query("SELECT * from `vpub-table`")
    fun getAllContinent(): LiveData<List<vPubEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(continent: vPubEntity)
    // ORDER BY vpubname ASC
}