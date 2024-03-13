package com.L0KODOM.candles.models

import com.varabyte.kobweb.compose.ui.graphics.Colors

interface Attribute {
    val name: String
}

data class CandleColor(override val name: String) : Attribute
data class Shape(override val name: String) : Attribute
data class Fragance(override val name: String) : Attribute
data class Size(override val name: String) : Attribute
data class Amount(override val name: String) : Attribute

val attributeList = listOf(CandleColor("Color"), Shape("Forma"), Fragance("Fragancia"),
    Size("Tamaño"),Amount("Cantidad"))

val colorList = listOf(Colors.Red, Colors.AntiqueWhite, Colors.Aquamarine, Colors.Crimson,)
val fraganceList = listOf("canela","limon","coco","romero")
val sizeList = listOf("100mL","200mL","300mL")
val amountList = listOf("1","6","12","24")
val shapeList = listOf("Normal", "Rallada","Redonda")

val redList = listOf(Colors.Red, Colors.DarkRed, Colors.OrangeRed)
val blueList = listOf(Colors.LightBlue, Colors.LightSteelBlue, Colors.Aquamarine)
val yellowList = listOf(Colors.Yellow, Colors.YellowGreen, Colors.LightYellow)
val greyList = listOf(Colors.WhiteSmoke, Colors.Gray, Colors.Black)
