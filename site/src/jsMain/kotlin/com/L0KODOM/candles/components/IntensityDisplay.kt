package com.L0KODOM.candles.components

import androidx.compose.runtime.Composable
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

@Composable
fun IntensitySelect(color: Boolean, red: Boolean, blue: Boolean, grey: Boolean, yellow: Boolean){
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        SpanText("INTENSIDAD")
        Row (modifier = Modifier.margin(top = 10.px)){
            IntensityBox("Baja",color,red, blue, grey, yellow)
            IntensityBox("Media",color, red, blue, grey, yellow)
            IntensityBox("Alta",color, red, blue, grey, yellow)
        }
    }
}
@Composable
fun IntensityBox(name: String, color: Boolean, red: Boolean, blue: Boolean, grey: Boolean, yellow: Boolean){

    if (!color){
        Box (modifier = Modifier.padding (5.px)
            .margin (5.px)
            .size(50.px)
            .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)){

            SpanText(name)
        }
    }else{
        if (name=="Alta" && red) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(redList[0])
            )
        }
        if (name=="Media" && red) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(redList[1])
            )
        }
        if (name=="Baja" && red) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(redList[2])
            )
        }
        if (name=="Alta" && blue) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(blueList[0])
            )
        }
        if (name=="Media" && blue) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(blueList[1])
            )
        }
        if (name=="Baja" && blue) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(blueList[2])
            )
        }
        if (name=="Alta" && grey) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(greyList[0])
            )
        }
        if (name=="Media" && grey) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(greyList[1])
            )
        }
        if (name=="Baja" && grey) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(greyList[2])
            )
        }
        if (name=="Alta" && yellow) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(yellowList[0])
            )
        }
        if (name=="Media" && yellow) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(yellowList[1])
            )
        }
        if (name=="Baja" && yellow) {
            Box(
                modifier = Modifier.padding(5.px)
                    .margin(5.px)
                    .size(50.px)
                    .border(2.px, color = Colors.Tan, style = LineStyle.Dotted)
                    .background(yellowList[2])
            )
        }
    }
}