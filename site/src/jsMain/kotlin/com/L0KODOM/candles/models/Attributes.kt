package com.L0KODOM.candles.models

import com.varabyte.kobweb.compose.ui.graphics.Colors

interface Attribute {
    val name: String
}

data class CandleColorDisplay(override val name: String) : Attribute
data class ShapeDisplay(override val name: String) : Attribute
data class FraganceDisplay(override val name: String) : Attribute
data class SizeDisplay(override val name: String) : Attribute
data class AmountDisplay(override val name: String) : Attribute

data class Fragance(val name: String, val category: String)

data class FraganceState(
    val list: List<Fragance>? = null
)

val attributeList = listOf(CandleColorDisplay("Color"), ShapeDisplay("Forma"), FraganceDisplay("Fragancia"),
    SizeDisplay("Tamaño"),AmountDisplay("Cantidad"))

val colorList = listOf(Colors.Red, Colors.AntiqueWhite, Colors.Aquamarine, Colors.Crimson,)
val fraganceList = listOf(
    Fragance("Cipress", "Vitalidad"),
    Fragance("Uva", "Vitalidad"),
    Fragance("helicriso", "Vitalidad"),
    Fragance("Eucalipto", "Refrescante"),
    Fragance("Limon - Eucalipto", "Refrescante"),
    Fragance("Menta", "Refrescante"),
    Fragance("Clary Sage", "Relajante"),
    Fragance("Uva Intensa", "Relajante"),
    Fragance("Mandarina", "Relajante"),
    Fragance("Lavanda", "Floral"),
    Fragance("Arbol de té", "Floral"),
    Fragance("Geranio", "Floral"),
    Fragance("Camomila", "Paz Interior"),
    Fragance("Vetiver", "Paz Interior"),
    Fragance("Madera de cedro", "Paz Interior"),
    Fragance("Yang Yang", "Dulce"),
    Fragance("Madera de Sándalo", "Dulce"),
    Fragance("Vainilla", "Dulce"),
    Fragance("Naranja Dulce", "Acogedor"),
    Fragance("Camomila Dulce", "Acogedor"),
    Fragance("Patxouli", "Romance"),
    Fragance("Pergamot", "Romance"),
    Fragance("Rosa", "Romance"),
    Fragance("Limón", "Concentración"),
    Fragance("Rosemary", "Concentración"),
    Fragance("Albahaca", "Concentración"),
    Fragance("Orégano", "Aire Fresco"),
    Fragance("Rosa - Limón", "Aire Fresco"),
    Fragance("Mirra", "Paz"),
    Fragance("Turmeric", "Respiración Limpia"),
    Fragance("Incienso", "Respiración Limpia"),
    Fragance("Junípero", "Nocturno"),
    Fragance("Copaiba", "Nocturno"),
    Fragance("Jazmin", "Felicidad"),
    Fragance("Neroli", "Felicidad"),
    Fragance("SpearMint", "Oceánico"),
    Fragance("Citroniella", "Oceánico"),
    Fragance("Lemon Grass", "Energética"),
    Fragance("Naranja Dulce - Menta", "Energética"),
    )
val fraganceCategories = listOf("Vitalidad", "Refrescante", "Relajante", "Floral","Paz Interior","Dulce", "Acogedor","Romance","Concentración",
    "Aire Fresco", "Respiración Limpia", "Nocturno", "Felicidad", "Oceánico", "Energética")
val sizeList = listOf("100mL","200mL","300mL")
val amountList = listOf("1","6","12","24")
val shapeList = listOf("Normal", "Rallada","Redonda")

val redList = listOf(Colors.Red, Colors.DarkRed, Colors.OrangeRed)
val blueList = listOf(Colors.LightBlue, Colors.LightSteelBlue, Colors.Aquamarine)
val yellowList = listOf(Colors.Yellow, Colors.YellowGreen, Colors.LightYellow)
val greyList = listOf(Colors.WhiteSmoke, Colors.Gray, Colors.Black)
