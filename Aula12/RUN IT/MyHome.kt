package com.qi.projectm.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.qi.projectm.R
import com.qi.projectm.composables.MyBottomBar
import com.qi.projectm.composables.MyTopBar
import com.qi.projectm.ui.theme.ProjectMTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyHome() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {  },
                content = {
                    Icon(
                        imageVector = Icons.Rounded.Check ,
                        contentDescription = "check"
                    )
                },
                containerColor = Color(0xFF08F3A0),
                contentColor = Color(0xFF673AB7)
            )},
        topBar = { MyTopBar() },
        bottomBar = { MyBottomBar() },
        content = {paddingValues ->
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground) ,
                    contentDescription = "imagem"
                )
            }
        },
        contentColor = Color(0xFF673AB7),
        containerColor = Color(0xFF673AB7)
    )
}


@Preview
@Composable
fun HomePrev() {
    ProjectMTheme {
        MyHome()
    }
}
