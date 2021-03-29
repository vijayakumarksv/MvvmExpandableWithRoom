package com.developer.gadget.expandablelistsamplewithroom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.developer.gadget.expandablelistsamplewithroom.R
import com.developer.gadget.expandablelistsamplewithroom.data.adapter.TestAdapter
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubDetails
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubEntity
import com.developer.gadget.expandablelistsamplewithroom.ui.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class RecyActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel
    val continents = ArrayList<vPubDetails>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add(10,5)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        viewModel.vpubentity.observe(this, Observer {

            for (vpubEntity: vPubEntity in it) {

                val continent =
                    vPubDetails(vpubEntity.vpubName, vpubEntity.vPubPhoto, false, vpubEntity.module)
                continents.add(continent)

            }
            // val adapter = VpubAdapter(this, continents)
            val adapter =
                TestAdapter(
                    this,
                    continents
                )
            rvConinent.apply {
                layoutManager = LinearLayoutManager(this@RecyActivity)
                //rvConinent.adapter = adapter
                rvConinent.adapter = adapter
            }
        })

    }

    fun add(a: Int, b: Int): Int {
        return (a + b)
    }

}
