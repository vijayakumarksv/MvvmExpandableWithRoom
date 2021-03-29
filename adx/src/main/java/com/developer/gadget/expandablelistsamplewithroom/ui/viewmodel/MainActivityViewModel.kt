package com.developer.gadget.expandablelistsamplewithroom.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.developer.gadget.expandablelistsamplewithroom.data.db.VPubDatabase
import com.developer.gadget.expandablelistsamplewithroom.data.model.Repository
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubEntity

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    public val repository: Repository

    val vpubentity: LiveData<List<vPubEntity>>

    init {
        val vpubDao = VPubDatabase.getDatabase(application, viewModelScope).vpubtDao()
        repository = Repository(vpubDao)
        vpubentity = repository.allContinents
    }

}