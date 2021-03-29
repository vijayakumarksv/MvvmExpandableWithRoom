package com.developer.gadget.expandablelistsamplewithroom.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Module(val module: String, val module_image:Int) : Parcelable