package com.qi.helloappm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.qi.helloappm.composables.MyBottomNavigation
import com.qi.helloappm.composables.MySideNavigation
import com.qi.helloappm.ui.theme.HelloappmTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloappmTheme {
                MyApp(windowSize = calculateWindowSizeClass(activity = this))
            }
        }
    }
}

@Composable //ver o tamanho da tela e definir
fun MyApp(
    modifier: Modifier = Modifier,
    windowSize: WindowSizeClass
){
    when(windowSize.widthSizeClass){
        (WindowWidthSizeClass.Compact) -> MyAppPortrait()
        (WindowWidthSizeClass.Expanded) -> MyAppLandscape()

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppLandscape(
    modifier: Modifier = Modifier
){
    Scaffold {
            pad ->
                Row {
                    MySideNavigation()
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(pad)
                            .fillMaxSize()
                    ) {
                        Text(text = "Hello")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppPortrait(
    modifier: Modifier = Modifier
){
    Scaffold(
        bottomBar = {MyBottomNavigation()},
        ) {
        pad -> Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(pad)
            .fillMaxSize()
        ) {
            Text(text = "Hello")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloappmTheme {
        MyBottomNavigation()
    }
}
@Preview(showBackground = true, heightDp = 300)
@Composable
fun DefaultPreview2() {
    HelloappmTheme {
        MySideNavigation()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    HelloappmTheme {
        MyAppPortrait()
    }
}
@Preview(showBackground = true, widthDp = 480, heightDp = 300)
@Composable
fun DefaultPreview4() {
    HelloappmTheme {
        MyAppLandscape()
    }
}
