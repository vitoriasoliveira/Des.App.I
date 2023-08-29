package com.vitoria.composetutorialm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitoria.composetutorialm.ui.theme.ComposeTutorialMTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialMTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(msg = Message("vitoria", "I'm going away for a while but i'll be back don't try to follow me, 'cause i'll return asap"))
                }
            }
        }
    }
}//fim da activity

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.caravela),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(5.dp))
        Column {
            Text(
                text = msg.author,
                //style = TextStyle(fontSize = TextUnit(20f, TextUnitType.Sp)
                style = MaterialTheme.typography.subtitle2,
                color = MaterialTheme.colors.primary
            )
            Spacer(modifier = Modifier.height(3.dp))
            Surface(
                elevation = 5.dp,
                color = Color.Magenta
            ) {
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    ComposeTutorialMTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            MessageCard(msg = Message("vitoria", "I'm going away for a while but i'll be back don't try to follow me, 'cause i'll return asap"))
        }
    }
}
