package com.L0KODOM.candles.components

import androidx.compose.runtime.*
import com.L0KODOM.candles.models.*
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AttributesColumn(attributes: List<Attribute>, intensity:()->Unit, color:()->Unit, red:()->Unit, blue:()->Unit, grey:()->Unit, yellow:()->Unit,
                     shape1:()->Unit,shape2:()->Unit,shape3:()->Unit, ingredient1: (String) -> Unit, intensity1: (Int) -> Unit,
                     ingredient2: (String) -> Unit, intensity2: (Int) -> Unit, ingName1: String, ingName2:String){

    var categoriesExpanded by remember{ mutableStateOf(false) }
    var fragancesExpanded by remember{ mutableStateOf(false) }
    var intensityExpanded by remember{ mutableStateOf(false) }
    var intensityNumber by remember{ mutableStateOf(1) }
    val maxIntensity = 3
    val minIntensity = 1
    var selectedCategory by remember { mutableStateOf<String?>(null) }
    var selectedFragance by remember { mutableStateOf<String?>(null) }

    Column {
        attributes.forEach {
            Row (verticalAlignment = Alignment.CenterVertically){
                Box (modifier = Modifier.width(100.px)){
                    P {
                        AttributeText(it.name)
                    }
                }
                when(it){
                    is CandleColorDisplay ->{
                        colorList.forEach { bkcolor ->
                            Box (modifier = Modifier
                                .size(50.px)
                                .margin (5.px)
                                .background(bkcolor)
                                .onClick { intensity()
                                    color()
                                    if (bkcolor == Colors.Red){
                                        red()
                                    }
                                    if (bkcolor == Colors.Aquamarine){
                                        blue()
                                    }
                                    if (bkcolor == Colors.AntiqueWhite){
                                        grey()
                                    }
                                    if (bkcolor == Colors.Crimson){
                                        yellow()
                                    }
                                })
                        }
                    }
                    is ShapeDisplay ->{
                        shapeList.forEach { shape->
                            Box (modifier = Modifier
                                .margin (5.px)
                                .padding (5.px)
                                .onClick {
                                    if (shape == "Normal"){
                                        shape1() }
                                    if (shape == "Rallada"){
                                        shape2() }
                                    if (shape == "Redonda"){
                                        shape3() }
                                }
                                .border (width = 2.px, color = Colors.Tan, style = LineStyle.Dotted),
                                contentAlignment = Alignment.Center){
                                P {
                                    Text(shape)
                                }
                            }
                        }
                    }
                    is FraganceDisplay ->{
                        if (!categoriesExpanded && !fragancesExpanded) {
                            Box(modifier = Modifier
                                .margin(5.px)
                                .padding(5.px)
                                .onClick { categoriesExpanded = true }
                                .border(width = 2.px, color = Colors.Tan, style = LineStyle.Dotted),
                                contentAlignment = Alignment.Center) {
                                P {
                                    Text("show")
                                }
                            }
                        }else{
                            Box(modifier = Modifier
                                .margin(5.px)
                                .padding(5.px)
                                .onClick {
                                    categoriesExpanded = false
                                    fragancesExpanded = false
                                    selectedCategory = null
                                    selectedFragance = null
                                    intensityExpanded = false}
                                .border(width = 2.px, color = Colors.Tan, style = LineStyle.Dotted),
                                contentAlignment = Alignment.Center) {
                                P {
                                    Text("close")
                                }
                            }
                        }
                        if (categoriesExpanded){
                            Column (verticalArrangement = Arrangement.Center){
                                val categoryList = FraganceType.entries
                                categoryList.forEach { cat ->
                                    Row (verticalAlignment = Alignment.CenterVertically){
                                        if (selectedCategory == null || selectedCategory == cat.categoryName) {
                                            Box(
                                                modifier = Modifier
                                                    .margin(5.px)
                                                    .padding(5.px)
                                                    .onClick {
                                                        selectedCategory = cat.categoryName
                                                    }
                                                    .border(width = 2.px, color = Colors.Tan, style = LineStyle.Dotted),
                                                contentAlignment = Alignment.Center
                                            ) {
                                                Text(cat.categoryName)
                                            }
                                        }
                                        if (selectedCategory == cat.categoryName) {
                                            val valueList = cat.getValueList()
                                            Column {
                                                valueList.forEach { fragance ->
                                                    Row (verticalAlignment = Alignment.CenterVertically){
                                                        if (selectedFragance == null || selectedFragance == fragance) {
                                                            Box(
                                                                modifier = Modifier
                                                                    .margin(5.px)
                                                                    .padding(5.px)
                                                                    .onClick { intensityExpanded = true
                                                                        selectedFragance = fragance}
                                                                    .border(
                                                                        width = 2.px,
                                                                        color = Colors.Tan,
                                                                        style = LineStyle.Groove
                                                                    ),
                                                                contentAlignment = Alignment.Center
                                                            ) {
                                                                Text(fragance)
                                                            }
                                                            if (intensityExpanded){
                                                                Row (verticalAlignment = Alignment.CenterVertically){
                                                                    Row (modifier = Modifier.margin(right = 20.px, left = 10.px)){
                                                                        FaDroplet(size = IconSize.XL)
                                                                        if (intensityNumber > 1) {
                                                                            FaDroplet(size = IconSize.XL)
                                                                        }
                                                                        if (intensityNumber > 2) {
                                                                            FaDroplet(size = IconSize.XL)
                                                                        }
                                                                    }
                                                                    if (intensityNumber < maxIntensity) {
                                                                        FaPlus(size = IconSize.SM,
                                                                            modifier = Modifier.onClick {
                                                                                intensityNumber++
                                                                            }
                                                                        )
                                                                    }
                                                                    if (intensityNumber > minIntensity){
                                                                        FaMinus(size = IconSize.SM,
                                                                            modifier = Modifier.onClick {
                                                                                intensityNumber--
                                                                            }
                                                                                .margin(5.px)
                                                                        )
                                                                    }
                                                                    if (ingName1.isNotEmpty()) {
                                                                        FaCheck(modifier = Modifier
                                                                            .margin(10.px)
                                                                            .onClick {
                                                                                ingredient2(fragance)
                                                                                intensity2(intensityNumber)
                                                                            }
                                                                        )
                                                                    }else{
                                                                        FaCheck(modifier = Modifier
                                                                            .margin(10.px)
                                                                            .onClick {
                                                                                ingredient1(fragance)
                                                                                intensity1(intensityNumber)
                                                                            }
                                                                        )
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    is SizeDisplay ->{
                        sizeList.forEach { it ->
                            Box (modifier = Modifier
                                .margin (5.px)
                                .padding (5.px)
                                .border (width = 2.px, color = Colors.Tan, style = LineStyle.Dotted),
                                contentAlignment = Alignment.Center){
                                P {
                                    Text(it)
                                }
                            }
                        }
                    }
                    is AmountDisplay ->{
                        amountList.forEach { it ->
                            Box (modifier = Modifier
                                .margin (5.px)
                                .padding (5.px)
                                .border (width = 2.px, color = Colors.Tan, style = LineStyle.Dotted),
                                contentAlignment = Alignment.Center){
                                P {
                                    Text(it)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AttributeText (name: String){
    SpanText(name,
        modifier = Modifier.fontSize(20.px)
            //.textDecorationLine(TextDecorationLine.Underline)
            .color(Colors.Brown))
}