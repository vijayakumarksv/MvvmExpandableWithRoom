package com.developer.gadget.expandablelistsamplewithroom.data

import com.developer.gadget.expandablelistsamplewithroom.R
import com.developer.gadget.expandablelistsamplewithroom.data.model.Module
import com.developer.gadget.expandablelistsamplewithroom.data.model.vPubEntity

class DataGenerator {

    companion object {
        fun getVpubDetails(): List<vPubEntity> {
            return listOf(
                vPubEntity(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. ",
                    R.mipmap.ic_launcher,
                    vPub_1()
                ),
                vPubEntity(
                    "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet",
                    R.mipmap.ic_launcher,
                    vPub_2()
                ),
                vPubEntity(
                    "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure",
                    R.mipmap.ic_launcher,
                    vPub_3()
                )
            )
        }

        fun vPub_1(): List<Module> {
            return listOf(
                Module("Module_1", R.drawable.ic_add),
                Module("Module_11", R.drawable.ic_launcher_foreground),
                Module("Module_111", R.drawable.ic_add),
                Module("Module_1111", R.drawable.ic_launcher_foreground)
            )
        }

        fun vPub_2(): List<Module> {
            return listOf(
                Module("Module_2", R.drawable.ic_add),
                Module("Module_22", R.drawable.ic_launcher_foreground),
                Module("Module_222", R.drawable.ic_add)
            )

        }

        fun vPub_3(): List<Module> {
            return listOf(
                Module("Module_3", R.drawable.ic_add),
                Module("Module_33", R.mipmap.ic_launcher),
                Module("Module_333", R.drawable.ic_launcher_foreground),
                Module("Module_3333", R.drawable.ic_launcher_foreground),
                Module("Module_33333", R.drawable.ic_launcher_foreground)
            )
        }

    }
}