package com.L0KODOM.candles.pages

import androidx.compose.runtime.*
import com.L0KODOM.candles.components.Customize
import com.L0KODOM.candles.components.Footer
import com.L0KODOM.candles.components.MainBody
import com.L0KODOM.candles.components.MyHeader
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.*

@Page
@Composable
fun HomePage() {

    Box(Modifier.fillMaxSize()
        .padding(top = 20.px, left = 40.px, right = 40.px)
        .backgroundImage(
            linearGradient (
                dir = LinearGradient.Direction.ToRight,
                from = Colors.White,
                to = Colors.AntiqueWhite
            )
        )) {
        Column (modifier = Modifier.fillMaxSize()){
            MyHeader()
            Column (modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                MainBody()
                Customize()
                Box (modifier = Modifier.height(150.px))
                Footer()
            }
        }
    }
}








