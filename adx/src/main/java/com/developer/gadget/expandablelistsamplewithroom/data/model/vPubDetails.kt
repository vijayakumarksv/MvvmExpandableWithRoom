package com.developer.gadget.expandablelistsamplewithroom.data.model

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup


data class vPubDetails(
    val continentName: String, val vpub_image:Int, var isExpand:Boolean,
    val module: List<Module>
):  ExpandableGroup<Module>(continentName, module)