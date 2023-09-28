package com.qi.projectm.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.qi.projectm.ui.theme.ProjectMTheme

@Composable
fun MyTopBar(
    modifier: Modifier = Modifier
) {
    MediumTopAppBar(
        title = { Text(
            text = "RUN IT",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        ) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color(0xD2E91E63),
            titleContentColor = Color(0xFFFFFFFF),
            navigationIconContentColor = Color(0xFFFFFFFF),
            actionIconContentColor = Color(0xFFFFFFFF)

        ),
        navigationIcon = {
            IconButton(
                onClick = { },
                content = {
                    Icon(
                        imageVector = Icons.Rounded.Menu,
                        contentDescription = "menu"
                    )
                }
            )},
        actions = {
            Icon(
                imageVector = Icons.Rounded.AddCircle,
                contentDescription = "menu"
            )

            Icon(
                imageVector = Icons.Rounded.Edit,
                contentDescription = "menu"
            )
        }
    )
}

@Preview
@Composable
fun TopBarPrev() {
    ProjectMTheme {
        MyTopBar()
    }

}
