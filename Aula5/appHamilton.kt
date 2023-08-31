package com.qi.aula6

import android.content.res.Configuration
import android.os.Bundle
import android.provider.Telephony.MmsSms.PendingMessages
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.aula6.ui.theme.Aula6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Conversation(messages = listMessage)
                }
            }
        }
    }
}
//fim da activity

//crindo classe de dados para padronizar as mensagens
data class Message(
    var avatar: Int,
    var autor: String,
    var body: String
)

@Composable
fun MessageCard(msg: Message) {
    Surface(modifier = Modifier.padding(15.dp)
    ) {
        Row {
           Image(
               painter = painterResource(id = msg.avatar),
               contentDescription = null,
               modifier = Modifier
                   .size(60.dp)
                   .clip(CircleShape)
           )

            Spacer(modifier = Modifier.width(8.dp))

            var isExpanded by remember {
                mutableStateOf(false)
            }
            Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {

                Text(
                    text = msg.autor,
                    style = MaterialTheme.typography.subtitle2
                )

                Spacer(modifier = Modifier.height(5.dp))

                Surface(
                    color = if(isExpanded) MaterialTheme.colors.secondary
                    else MaterialTheme.colors.primary,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = msg.body,
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}

//criando lista de mensagens
var listMessage = mutableListOf(
    Message(
        R.drawable.hamilton,
        "Alexander",
        "Pardon me \nR U Aron Burr, sir?"
    ),
    Message(
        R.drawable.aron,
        "Aron",
        "That depends. \nWho's asking?"
    ),
    Message(
        R.drawable.john,
        "John",
        "I've heard you got a special someone on the side\nBurr"
    ),
    Message(
        R.drawable.lafayette,
        "Lafayette",
        "oui oui\nmon ami\nje m'apelle Lafayette"
    )
)
@Composable
fun Conversation(messages: List<Message>){
    LazyColumn{
        items(messages){
            eachMsg -> MessageCard(msg = eachMsg)
        }
    }
}
@Preview(
    showBackground = true,
    name = "Light Mode"
)
@Preview(
    name = "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)

@Composable
fun Aula6Preview() {
    Aula6Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            //MessageCard(listMessage[0])
            Conversation(listMessage)
        }
    }
}
