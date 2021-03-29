package com.developer.gadget.expandablelistsamplewithroom.data.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.developer.gadget.expandablelistsamplewithroom.R
import com.developer.gadget.expandablelistsamplewithroom.data.model.Module
import com.gadget.android.common.CommonInfo
import java.util.*

class ModuleAdapter(
    private val context: Context,
    modules: List<Module>
) : RecyclerView.Adapter<ModuleAdapter.ViewHolder>() {
    var modules: List<Module> =
        ArrayList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.module_expand, parent, false)
        return ViewHolder(
            view
        )
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.child_module_image.setImageResource(modules[position].module_image)
        holder.txt_child_module_name.text = modules[position].module
        holder.itemView.setOnClickListener {
            Toast.makeText(
                context,
                "Child_Clicked :" + modules[position].module,
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(context, CommonInfo::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return modules.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val child_module_image: ImageView
        val txt_child_module_name: TextView

        init {
            child_module_image =
                itemView.findViewById(R.id.child_module_image)
            txt_child_module_name = itemView.findViewById(R.id.txt_child_module_name)
        }
    }

    init {
        this.modules = modules
    }

}