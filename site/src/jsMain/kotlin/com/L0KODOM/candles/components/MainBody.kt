package com.L0KODOM.candles.components

import androidx.compose.runtime.Composable
import com.L0KODOM.candles.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.B
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.Image
import org.w3c.fetch.Response
import org.w3c.fetch.ResponseType

@Composable
fun MainBody(){
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround){
        ProductCard(Res.Strings.TITLE1, Res.Strings.DESCRIPTION1 ,Res.Images.CANDLE1)
        ProductCard(Res.Strings.TITLE2, Res.Strings.DESCRIPTION2 ,Res.Images.CANDLE2)
        ProductCard(Res.Strings.TITLE3, Res.Strings.DESCRIPTION3 ,Res.Images.CANDLE3)
    }
    AboutUs()
}
@Composable
fun AboutUs(){
    Box (modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Column (modifier = Modifier
            .backgroundImage(
                linearGradient (
                    dir = LinearGradient.Direction.ToRight,
                    from = Colors.White,
                    to = Colors.AntiqueWhite
                ))
            .margin (top = 5.percent)
            .padding (10.px)
            .borderRadius(r = 8.px), horizontalAlignment = Alignment.CenterHorizontally){
            SpanText("Sobre Nosotros",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(20.px))
            P {
                SpanText(Res.Strings.ABOUT_US_DESC,
                    modifier = Modifier.fontSize(16.px))
            }
        }
    }
}

