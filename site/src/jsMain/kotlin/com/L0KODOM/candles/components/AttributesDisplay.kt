package com.L0KODOM.candles.components

import androidx.compose.runtime.Composable
import com.L0KODOM.candles.models.*
import com.varabyte.kobweb.compose.css.TextDecorationLine
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
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AttributesColumn(intensity:()->Unit, color:()->Unit, red:()->Unit, blue:()->Unit, grey:()->Unit, yellow:()->Unit){
    Column {
        AttributeRow(attributeList, intensity, color,red, blue, grey, yellow)
    }
}

@Composable
fun AttributeRow(attributes: List<Attribute>, intensity:()->Unit, color:()->Unit, red:()->Unit, blue:()->Unit, grey:()->Unit, yellow:()->Unit){
    attributes.forEach {
        Row (verticalAlignment = Alignment.CenterVertically){
            Box (modifier = Modifier.width(100.px)){
                P {
                    AttributeText(it.name)
                }
            }
            when(it){
                is CandleColor ->{
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
                is Shape ->{
                    shapeList.forEach { it ->
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
                is Fragance ->{
                    fraganceList.forEach { it ->
                        Box (modifier = Modifier
                            .margin (5.px)
                            .padding (5.px)
                            .onClick { intensity() }
                            .border (width = 2.px, color = Colors.Tan, style = LineStyle.Dotted),
                            contentAlignment = Alignment.Center){
                            P {
                                Text(it)
                            }
                        }
                    }
                }
                is Size ->{
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
                is Amount ->{
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
@Composable
fun AttributeText (name: String){
    SpanText(name,
        modifier = Modifier.fontSize(20.px)
            //.textDecorationLine(TextDecorationLine.Underline)
            .color(Colors.Brown))
}