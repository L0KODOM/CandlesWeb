package com.L0KODOM.candles.components

import androidx.compose.runtime.*
import com.L0KODOM.candles.models.*
import com.L0KODOM.candles.util.Res
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
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaDroplet
import com.varabyte.kobweb.silk.components.icons.fa.FaTrash
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Customize(){

    var intensityShow by remember { mutableStateOf(false) }
    var ingredientsShow by remember { mutableStateOf(true) }
    var colorShow by remember { mutableStateOf(false) }
    var redShow by remember { mutableStateOf(false) }
    var yellowShow by remember { mutableStateOf(false) }
    var greyShow by remember { mutableStateOf(false) }
    var blueShow by remember { mutableStateOf(false) }
    var shape1 by remember { mutableStateOf(true) }
    var shape2 by remember { mutableStateOf(false) }
    var shape3 by remember { mutableStateOf(false) }
    var ingredient1 by remember{ mutableStateOf("") }
    var intensity1 by remember{ mutableStateOf(1) }
    var ingredient2 by remember{ mutableStateOf("") }
    var intensity2 by remember{ mutableStateOf(1) }
    var firstIngredientSelected by remember { mutableStateOf(false) }

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
            AttributesColumn(attributeList,{intensityShow = !intensityShow}, {colorShow = !colorShow},
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
                    redShow=false},
                {shape1 = true
                    shape2 = false
                    shape3 = false},
                {shape2 = true
                    shape1 = false
                    shape3 = false},
                {shape3 = true
                    shape2 = false
                    shape1 = false},
                {ing1 -> ingredient1 = ing1},{int1 -> intensity1 = int1},{ing2 -> ingredient2 = ing2},{int2 -> intensity2 = int2},
                ingredient1,ingredient2)
            Column {
                if (intensityShow) {
                    IntensitySelect(redShow,blueShow,greyShow,yellowShow)
                }
                if (ingredientsShow){
                    IngredientsDisplay(ingredient1,intensity1,ingredient2,intensity2,{ firstSelected ->
                        ingredient1 = firstSelected
                    },{ firstSelected ->
                        ingredient2 = firstSelected
                    })
                }
            }
            CustomResult(modification,shape1,shape2,shape3)
        }
    }
}
@Composable
fun IngredientsDisplay(name1:String, int1: Int, name2:String, int2: Int, firstSelected:(String)->Unit, secondtSelected:(String)->Unit){

    if (name1.isEmpty() && name2.isEmpty()){
        Box (modifier = Modifier.size(10.px))
    }else{
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text("INGREDIENTES")
            Box {
                Column {
                    if (name1.isNotEmpty()){
                        Row (verticalAlignment = Alignment.CenterVertically){
                            SpanText(name1, modifier =Modifier.margin(10.px))
                            FaDroplet(size = IconSize.XL)
                            if (int1>1){
                                FaDroplet(size = IconSize.XL)
                            }
                            if (int1>2){
                                FaDroplet(size = IconSize.XL)
                            }
                            FaTrash(modifier = Modifier.color(Colors.Gray)
                                .onClick {firstSelected("")}
                                .margin (10.px))

                        }
                    }
                    if (name2.isNotEmpty()) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            SpanText(name2, modifier = Modifier.margin(10.px))
                            FaDroplet(size = IconSize.XL)
                            if (int2 > 1) {
                                FaDroplet(size = IconSize.XL)
                            }
                            if (int2 > 2) {
                                FaDroplet(size = IconSize.XL)
                            }
                            FaTrash(modifier = Modifier.color(Colors.Gray)
                                .onClick { secondtSelected("")}
                                .margin (10.px)
                            )
                        }
                    }
                }
            }
        }
    }
}
val modification = Modifier
    .size(350.px)
    .borderRadius(8.px)
    .boxShadow(
        color = Colors.Black.copy(alpha = 10),
        blurRadius = 50.px,
        spreadRadius = 50.px)
@Composable
fun CustomResult(myModifier: Modifier, shape1: Boolean, shape2: Boolean, shape3: Boolean){
    if (shape1) {
        Image(
            Res.Images.CUSTOM_CANDLE, modifier = myModifier)
    }
    if (shape2) {
        Image(
            Res.Images.CANDLE1, modifier = myModifier)
    }
    if (shape3) {
        Image(
            Res.Images.CANDLE3, modifier = myModifier)
    }

}

