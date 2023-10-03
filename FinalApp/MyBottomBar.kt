package com.qi.finalproject.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.finalproject.ui.theme.FinalProjectTheme

@Composable
fun MyBottomBar(
    modifier: Modifier = Modifier
){

    NavigationBar(
        containerColor = Color(0xFFE91E63),
        contentColor = Color(0xFFFFFFFF)
    ) {
        Row (
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            TextButton(
                onClick = { /*TODO*/ },
                content = {
                    Text(
                        text = "CLIQUE",
                        color = Color(0xFFFFFFFF)
                    )
                }
            )

            IconButton(
                onClick = { /*TODO*/ },
                content = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
            )
        }
    }
}

@Preview
@Composable
fun MyBottomBarPrev() {
    FinalProjectTheme {
        MyBottomBar()
    }
