package com.qi.finalproject.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.finalproject.ui.theme.FinalProjectTheme

@Composable
fun MyGrid(
    modifier: Modifier = Modifier,
    list: List <Unit> = List(20) {}
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(5.dp),
        columns = GridCells.Fixed(2),
        content = {
            items(list) {
                MyCardState()
            }
        }
    )
}

@Preview
@Composable
fun MyGridPrev() {
    FinalProjectTheme {
        MyGrid()
    }
}
