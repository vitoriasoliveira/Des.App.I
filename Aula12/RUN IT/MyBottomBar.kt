package com.qi.projectm.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.projectm.ui.theme.ProjectMTheme

@Composable
fun MyBottomBar(
    modifier: Modifier = Modifier
) {
    BottomAppBar(
        containerColor = Color(0xD2E91E63),
        contentColor = Color(0xFFFAF2F2),
        content = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { },
                    content = {
                        Icon(
                            imageVector = Icons.Outlined.Home,
                            contentDescription = "botão home"
                        ) }
                )

                IconButton(
                    onClick = { },
                    content = {
                        Icon(
                        imageVector = Icons.Outlined.Email,
                        contentDescription = "botão email"
                    )}
                )
                //espaçamento entre botões
                //Spacer(modifier = modifier.width(100.dp))

                Text(text = "Settings")
            }
        }
    ) //final bottom app bar
        

}

@Preview
@Composable
fun BottomBarPrev() {
    ProjectMTheme {
        MyBottomBar()
    }
}
