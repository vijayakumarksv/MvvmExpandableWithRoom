package com.developer.gadget.expandablelistsamplewithroom.data.model

import androidx.lifecycle.LiveData
import com.developer.gadget.expandablelistsamplewithroom.data.db.VPubDao

class Repository(continentDao: VPubDao) {

    val allContinents: LiveData<List<vPubEntity>> = continentDao.getAllContinent()

}