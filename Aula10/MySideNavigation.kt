package com.qi.helloappm.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MySideNavigation(
    modifier: Modifier = Modifier
){
    NavigationRail {
        Column(
            modifier = Modifier.fillMaxHeight() ,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            NavigationRailItem(
                selected = false,
                onClick = {  },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Home,
                        contentDescription = null
                    )
                }
            )

            NavigationRailItem(
                selected = false,
                onClick = {  },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Face,
                        contentDescription = null
                    )
                }
            )

            NavigationRailItem(
                selected = false,
                onClick = {  },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Settings,
                        contentDescription = null
                    )
                }
            )
        }
    }
}
