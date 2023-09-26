package com.qi.instagreenm.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.qi.instagreenm.composables.MyCardState
import com.qi.instagreenm.composables.MyNavigationState
import com.qi.instagreenm.ui.theme.InstagreenMTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyHomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        bottomBar = { MyNavigationState()}
    ) {
        myVar -> Column (
        modifier = Modifier
            .padding(myVar)
            .verticalScroll(rememberScrollState())
    ){
        MyCardState()
        MyCardState()
        MyCardState()
        MyCardState()
        MyCardState()
        MyCardState()
    }
    }
}


@Preview
@Composable
fun MyHomePrev() {
    InstagreenMTheme {
        MyHomeScreen()
    }
