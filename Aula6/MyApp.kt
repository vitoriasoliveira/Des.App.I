package com.qi.basiccodelabmanha

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.AndroidPath
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.qi.basiccodelabmanha.ui.theme.BasicCodelabManhaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicCodelabManhaTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){
    Greetings()
}


@Composable
fun Greetings( names: List<String> = List(10){"$it"}){
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)){
        items(names){
            Greeting(name = it)
        }
    }
}

@Composable
fun Greeting(name: String) {
    var expanded by remember {
        mutableStateOf(false)
    }
    val extraPadding by animateDpAsState(
        targetValue = if(expanded) 50.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioHighBouncy,
            stiffness = Spring.StiffnessLow
        )
    )
    Surface(
        color = MaterialTheme.colorScheme.primary,
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(20.dp),

        ) {
            Column(modifier = Modifier.padding(vertical = extraPadding.coerceAtLeast(0.dp))) {
                // PARA ELEMENTOS DE TEXTO Text(text = "Hello")
               Icon(
                   imageVector = Icons.Rounded.Person,
                   contentDescription = null
               )
                if(expanded){
                    Text(text = "$name!")
                }
            }

            ElevatedButton(
                onClick = {
                    expanded = !expanded
                }
            ) {
                Text(text = if(expanded) "Show less" else "Show more")
            }
        }
    }
}

@Preview(
    showBackground = true,
    name = "Light mode",
    widthDp = 320
)
@Preview(
    showBackground = true,
    name = "Dark mode",
    widthDp = 320,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)

@Composable
fun DefaultPreview() {
    BasicCodelabManhaTheme {
        MyApp()
    }
}
