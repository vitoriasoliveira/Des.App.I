package com.qi.finalproject.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.finalproject.R
import com.qi.finalproject.ui.theme.FinalProjectTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCard(
    modifier: Modifier = Modifier,
    @DrawableRes image : Int,
    text : String,
    check : Boolean,
    onCheck : (Boolean) -> Unit
) {
    Card(
        modifier = Modifier.padding(5.dp),
        content = {
            Column(
                modifier = Modifier.padding(5.dp)
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.fillMaxWidth()
                )

                Divider(
                    thickness = 1.dp,
                    modifier = Modifier.padding(10.dp)
                )

                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .fillMaxWidth()
               ){
                    Text(
                        text = text,
                        textAlign = TextAlign.Start
                    )

                    Switch(
                        checked = check,
                        onCheckedChange = onCheck,
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color(0xFFE91E63)
                        )
                    )

                }
            }//fim da column
        }//fim do content
    )
}

@Composable
fun MyCardState(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int = R.drawable.ic_launcher_background,
    text: String = "texto"
) {
    var check by remember {
        mutableStateOf(false)
    }
    MyCard(
        image = image , 
        text = text, 
        check = check, 
        onCheck = { x -> check = x } 
    )
}

@Preview
@Composable
fun MyCardPrev() {
    FinalProjectTheme {
       MyCardState()
    }

