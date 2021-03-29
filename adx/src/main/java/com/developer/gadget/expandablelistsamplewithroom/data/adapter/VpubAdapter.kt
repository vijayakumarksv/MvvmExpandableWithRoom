package com.developer.gadget.expandablelistsamplewithroom.data.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.developer.gadget.expandablelistsamplewithroom.R
import com.developer.gadget.expandablelistsamplewithroom.data.adapter.ModuleViewHolder
import com.developer.gadget.expandablelistsamplewithroom.data.adapter.VpubViewHolder
import com.developer.gadget.expandablelistsamplewithroom.data.model.Module
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubDetails
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class VpubAdapter(val context: Context, groups: List<ExpandableGroup<*>>?) :
    ExpandableRecyclerViewAdapter<VpubViewHolder, ModuleViewHolder>(
        groups
    ) {

    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): VpubViewHolder {
        val itemView =
            LayoutInflater.from(parent?.context).inflate(R.layout.continent_layout, parent, false)
        return VpubViewHolder(
            itemView
        )
    }

    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): ModuleViewHolder {
        val itemView =
            LayoutInflater.from(parent?.context).inflate(R.layout.countrys_layout, parent, false)
        return ModuleViewHolder(
            itemView
        )
    }

    override fun onBindChildViewHolder(
        holder: ModuleViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?,
        childIndex: Int
    ) {
        val model_module: Module = group?.items?.get(childIndex) as Module
        holder?.bind(model_module,context)
        //Toast.makeText(context, model_module.module.get(childIndex).toString(), Toast.LENGTH_SHORT).show()
    }

    override fun onBindGroupViewHolder(
        holder: VpubViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?
    ) {
        val continent: vPubDetails = group as vPubDetails
        holder?.bind(continent,context)
    }

}