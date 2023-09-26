package com.qi.instagreenm.composables

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.instagreenm.R
import com.qi.instagreenm.ui.theme.InstagreenMTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCard(
    modifier: Modifier = Modifier,
    @DrawableRes image : Int,
    likeIcon: Boolean = false,
    @StringRes text: Int,
    onChangeLike: () -> Unit
) {
    Card {
       Column {
           Image(
               modifier = Modifier.fillMaxWidth(),
               contentScale = ContentScale.FillWidth,
               painter = painterResource(id = image) ,
               contentDescription = null
           )
           IconButton(
               onClick = onChangeLike,
               content = {
                   Icon(
                       imageVector =
                       if (likeIcon) Icons.Default.Favorite
                       else Icons.Default.FavoriteBorder,
                       contentDescription = null 
                   )        
               }
           )
           Divider(
               thickness = 2.dp,
               modifier = Modifier.fillMaxWidth(),
               color = Color.Green
           )
           
           Text(
               modifier = Modifier.padding(vertical = 10.dp, horizontal = 5.dp),
               text = stringResource(id = text),
               style = MaterialTheme.typography.bodyMedium
           )
       }
    }
}

@Composable
fun MyCardState(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int = R.drawable.ic_launcher_background,
    @StringRes text: Int = R.string.text
) {
    var checked by remember {
        mutableStateOf(false)
    }
    MyCard(
        likeIcon = checked,
        onChangeLike = { checked = !checked},
        image = image,
        text = text
    )
}


@Preview(widthDp = 320)
@Composable
fun CardPreview() {
    InstagreenMTheme {
        MyCardState()
    }
}
