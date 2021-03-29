package com.developer.gadget.expandablelistsamplewithroom.data.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.developer.gadget.expandablelistsamplewithroom.R
import com.developer.gadget.expandablelistsamplewithroom.data.model.Module
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubDetails
import java.util.*
import kotlin.collections.ArrayList

class TestAdapter(
    var context: Context,
    continents: ArrayList<vPubDetails>
) : RecyclerView.Adapter<TestAdapter.ViewHolder>() {
    var continents = ArrayList<vPubDetails>()
    var modules: List<Module> =
        ArrayList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.continent_layout, parent, false)
        return ViewHolder(
            view
        )
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.vpub_image.setImageResource(continents[position].vpub_image)
        holder.continent.text = continents[position].continentName
        holder.itemView.setOnClickListener {
            var str_pos = continents[position].isExpand
            if (!str_pos) {
                continents[position].isExpand = true
                modules = continents[position].module
                holder.module_recyview.layoutManager = GridLayoutManager(context, 3)
                holder.module_recyview.visibility = View.VISIBLE
                holder.arrow.setImageResource(R.drawable.shape_minus)
                notifyDataSetChanged()
                val adapter = ModuleAdapter(context, modules)
                holder.module_recyview.adapter = adapter
            } else {
                continents[position].isExpand = false
                holder.module_recyview.visibility = View.GONE
                holder.arrow.setImageResource(R.drawable.shape_plus)
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int {
        return continents.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val parent_cardview: LinearLayout
        val arrow: ImageView
        val vpub_image: ImageView
        val continent: TextView
        val module_recyview: RecyclerView

        init {
            parent_cardview = itemView.findViewById(R.id.parent_cardview)
            arrow = itemView.findViewById(R.id.arrow)
            vpub_image = itemView.findViewById(R.id.vpub_image)
            continent = itemView.findViewById(R.id.continent)
            module_recyview = itemView.findViewById(R.id.module_recyview)
        }
    }

    init {
        this.continents = continents
    }

}