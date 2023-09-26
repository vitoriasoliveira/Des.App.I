package com.qi.instagreenm.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.qi.instagreenm.ui.theme.InstagreenMTheme

@Composable
fun MyNavigation(
    modifier: Modifier = Modifier,
    item: Int,
    onChangeItem: () -> Unit
) {
    NavigationBar() {
        NavigationBarItem(
            selected = item == 1,
            onClick = onChangeItem,
            icon = { Text(text = "Perfil") }
        )

        NavigationBarItem(
            selected = item == 2,
            onClick = onChangeItem,
            icon = { Text(text = "Home") }
        )

        NavigationBarItem(
            selected = item == 3,
            onClick = onChangeItem,
            icon = {
                Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null
                )
            }

        )
    }
}

@Composable
fun MyNavigationState(
    modifier: Modifier = Modifier
) {
    var barItem by remember {
        mutableStateOf(0)
    }

    MyNavigation(
        item = barItem,
        onChangeItem = {}
    )

}


@Preview
@Composable
fun NavPreview() {
    InstagreenMTheme {
        MyNavigationState()
    }
}
