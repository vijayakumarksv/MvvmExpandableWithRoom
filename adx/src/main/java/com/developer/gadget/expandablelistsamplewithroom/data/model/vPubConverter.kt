package com.developer.gadget.expandablelistsamplewithroom.data.model

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*


class vPubConverter {


    companion object {
        var gson: Gson = Gson()

        @TypeConverter
        @JvmStatic
        fun stringToSomeObjectList(data: String?): List<Module> {
            val listType: Type =
                object : TypeToken<List<Module?>?>() {}.getType()
            return gson.fromJson(data, listType)
        }

        @TypeConverter
        @JvmStatic
        fun someObjectListToString(someObjects: List<Module>?): String {
            return gson.toJson(someObjects)
        }
    }

}