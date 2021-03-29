package com.developer.gadget.expandablelistsamplewithroom.data.adapter

import android.content.Context
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.developer.gadget.expandablelistsamplewithroom.R
import com.developer.gadget.expandablelistsamplewithroom.data.model.Module
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubDetails
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder


class ModuleViewHolder(itemView: View) : ChildViewHolder(itemView) {
    lateinit var vpubname:TextView
    lateinit var module_image:ImageView
    lateinit var cardview:CardView

    init {
        vpubname = itemView.findViewById<TextView>(R.id.countryName)
        module_image = itemView.findViewById<ImageView>(R.id.module_image)
        cardview = itemView.findViewById<CardView>(R.id.cardview)
    }

    fun bind(model_module: Module, context: Context) {
        vpubname.text = model_module.module
        module_image.setImageResource(model_module.module_image)
        vpubname.setOnClickListener {
            Toast.makeText(context, model_module.module, Toast.LENGTH_SHORT).show()
        }
    }

}

class VpubViewHolder(itemView: View) : GroupViewHolder(itemView), OnClickListener {
    lateinit var vpub_image: ImageView
    lateinit var continentName: TextView
    lateinit var arrow: ImageView
    lateinit var parent_cardview: LinearLayout

    init {
        vpub_image = itemView.findViewById<ImageView>(R.id.vpub_image)
        continentName = itemView.findViewById<TextView>(R.id.continent)
        arrow = itemView.findViewById<ImageView>(R.id.arrow)
        parent_cardview = itemView.findViewById<LinearLayout>(R.id.parent_cardview)
    }

    fun bind(continent: vPubDetails, context: Context) {
        continentName.text = continent.continentName
        vpub_image.setImageResource(continent.vpub_image)
        var isExpand: Boolean = true
        continentName.setOnClickListener {
            if (isExpand) {
                isExpand = true
                arrow.setImageResource(R.drawable.ic_add)
            } else {
                isExpand = false
                arrow.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp)
            }
            isExpand = !isExpand
        }
    }

}