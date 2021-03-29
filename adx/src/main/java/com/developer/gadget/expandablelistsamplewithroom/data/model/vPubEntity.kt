package com.developer.gadget.expandablelistsamplewithroom.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity(tableName = "vpub-table")
@TypeConverters(vPubConverter::class)
data class vPubEntity(
    @ColumnInfo(name = "vpubname") val vpubName: String,
    @ColumnInfo(typeAffinity = ColumnInfo.INTEGER) val vPubPhoto: Int,
    val module: List<Module>
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
//    @ColumnInfo(typeAffinity = ColumnInfo.BLOB) val vPubPhoto: ByteArray,