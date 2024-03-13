package com.L0KODOM.candles.components

import androidx.compose.runtime.*
import com.L0KODOM.candles.models.blueList
import com.L0KODOM.candles.models.greyList
import com.L0KODOM.candles.models.redList
import com.L0KODOM.candles.models.yellowList
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Customize(){

    var intensityShow by remember { mutableStateOf(false) }
    var colorShow by remember { mutableStateOf(false) }
    var redShow by remember { mutableStateOf(false) }
    var yellowShow by remember { mutableStateOf(false) }
    var greyShow by remember { mutableStateOf(false) }
    var blueShow by remember { mutableStateOf(false) }

    Column (modifier = Modifier.fillMaxWidth()
        .margin (top = 5.percent),
        horizontalAlignment = Alignment.CenterHorizontally){

        P (
            attrs = Modifier.fontSize(20.px).toAttrs()
        ){
            SpanText("PERSONALIZACION",
                modifier = Modifier.fontSize(25.px)
                    .fontWeight(FontWeight.Bold))
        }
        Row (modifier = Modifier.fillMaxWidth()
            .margin (top = 3.percent), horizontalArrangement = Arrangement.SpaceAround){
            AttributesColumn({intensityShow = !intensityShow}, {colorShow = !colorShow},
                {redShow = !redShow
                blueShow= false
                greyShow=false
                yellowShow=false},
                {blueShow = !blueShow
                    redShow= false
                    greyShow=false
                    yellowShow=false},
                {greyShow = !greyShow
                    blueShow= false
                    redShow=false
                    yellowShow=false},
                {yellowShow = !yellowShow
                    blueShow= false
                    greyShow=false
                    redShow=false},)
            if (intensityShow) {
                IntensitySelect(colorShow,redShow,blueShow,greyShow,yellowShow)
            }
            CustomResult()
        }
    }
}
@Composable
fun CustomResult(){
    Box (modifier = Modifier.size(30.percent).background(Colors.Tan),
        contentAlignment = Alignment.Center){
        Text("foto")
    }
}

