package com.L0KODOM.candles.components

import androidx.compose.runtime.*
import com.L0KODOM.candles.models.blueList
import com.L0KODOM.candles.models.greyList
import com.L0KODOM.candles.models.redList
import com.L0KODOM.candles.models.yellowList
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

val intensityList = listOf("Baja","Media","Alta")

@Composable
fun IntensitySelect(red: Boolean, blue: Boolean, grey: Boolean, yellow: Boolean){

    var selectedColor by remember { mutableStateOf<String?>(null) }

    Column (horizontalAlignment = Alignment.CenterHorizontally){
        SpanText("INTENSIDAD")
        Row (modifier = Modifier.margin(top = 10.px)){
            intensityList.forEach {level ->
                if (selectedColor == null || selectedColor == level)
                    IntensityBox(level,red, blue, grey, yellow){selectedColor=level}
            }
        }
    }
}
@Composable
fun IntensityBox(name: String, red: Boolean, blue: Boolean, grey: Boolean, yellow: Boolean, selectColor: ()->Unit){

    if (name=="Alta" && red) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(redList[0])
                .onClick { selectColor() }
        )
    }
    if (name=="Media" && red) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(redList[1])
                .onClick { selectColor() }
        )
    }
    if (name=="Baja" && red) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(redList[2])
                .onClick { selectColor() }
        )
    }
    if (name=="Alta" && blue) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(blueList[0])
                .onClick { selectColor() }
        )
    }
    if (name=="Media" && blue) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(blueList[1])
                .onClick { selectColor() }
        )
    }
    if (name=="Baja" && blue) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(blueList[2])
                .onClick { selectColor() }
        )
    }
    if (name=="Alta" && grey) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(greyList[0])
                .onClick { selectColor() }
        )
    }
    if (name=="Media" && grey) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(greyList[1])
                .onClick { selectColor() }
        )
    }
    if (name=="Baja" && grey) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(greyList[2])
                .onClick { selectColor() }
        )
    }
    if (name=="Alta" && yellow) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(yellowList[0])
                .onClick { selectColor() }
        )
    }
    if (name=="Media" && yellow) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(yellowList[1])
                .onClick { selectColor() }
        )
    }
    if (name=="Baja" && yellow) {
        Box(
            modifier = Modifier.padding(5.px)
                .margin(5.px)
                .size(50.px)
                .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                .background(yellowList[2])
                .onClick { selectColor() }
        )
    }
}