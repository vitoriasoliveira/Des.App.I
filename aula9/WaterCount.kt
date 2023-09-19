package com.qi.watercountm.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.watercountm.R

@Composable
fun WaterCountState(
    modifier: Modifier = Modifier
){
    var counter by remember {
        mutableStateOf(0)
    }

    WaterCount(
        count = counter,
        onIncrement = { counter++ },
        onReset =  { counter = 0 }
    )
}

@Composable
fun WaterCount(
    modifier: Modifier = Modifier,
    count: Int,
    onIncrement: () -> Unit,
    onReset: () -> Unit
){
    Column(
        modifier = modifier.fillMaxSize() //pegar tamanho da tela
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            //dois botoes
            Button(
                onClick = onIncrement,
                enabled = count < 10
            ) {
               Text(text = stringResource(id = R.string.btn_more))
            }

            Button(
                onClick = onReset,
                enabled = count > 0
            ) {
                Text(text = stringResource(id = R.string.btn_reset))
            }

        }
        //faz uma linha na tela
        Divider(
            modifier = modifier.padding(15.dp),
            thickness = 2.dp
        )

        Text(
            text = stringResource(id = R.string.message) + " $count",
            modifier = modifier.fillMaxWidth(),
            style = TextStyle(textAlign = TextAlign.Center)
            //modifier = modifier.padding(horizontal = 20.dp),

        )
    }
}
