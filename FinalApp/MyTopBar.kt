package com.qi.finalproject.composables

import android.graphics.Paint.Style
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.qi.finalproject.ui.theme.FinalProjectTheme
import java.time.format.TextStyle

@Composable
fun MyTopBar(
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color(0xFFE91E63),
            titleContentColor = Color(0xFFFFFFFF)
        ),
        title = {
            Text(
                text = "APLICATIVO",
                fontWeight = FontWeight(700)
            )
        }
    )
}

@Preview
@Composable
fun MyTopBarPrev() {
    FinalProjectTheme {
        MyTopBar()
    }
