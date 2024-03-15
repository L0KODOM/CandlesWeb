package com.L0KODOM.candles.components

import androidx.compose.runtime.Composable
import com.L0KODOM.candles.util.Res
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.browser.window
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Footer(){
    Row (modifier = Modifier.fillMaxWidth()
        .padding (10.px)
        .background(Colors.BlanchedAlmond),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically){

        Column (horizontalAlignment = Alignment.CenterHorizontally){
            SpanText("HORARIO DE ATENCION: ")
            SpanText("09:00am - 17:00pm")
        }
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            P {
                Text("CONTACTO")
            }
            Row {
                Image(Res.Icons.FACEBOOK, height = 30, width = 30, modifier = Modifier.margin(10.px).onClick {
                    window.location.href= Res.Links.FACEBOOK
                })
                Image(Res.Icons.INSTAGRAM, height = 30, width = 30, modifier = Modifier.margin(10.px).onClick {
                    window.location.href= Res.Links.INSTAGRAM
                })
                Image(Res.Icons.WHATSAPP, height = 30, width = 30, modifier = Modifier.margin(10.px).onClick {
                    window.location.href= Res.Links.WHATSAPP
                })
            }
        }
        Column (
            verticalArrangement = Arrangement.SpaceAround){

            Row (modifier = Modifier.onClick { window.location.href = Res.Links.PHONE }, verticalAlignment = Alignment.CenterVertically){
                FaPhone(modifier = Modifier.margin(5.px))
                SpanText("664419949", modifier = Modifier.textDecorationLine(TextDecorationLine.Underline))
            }
            Row (verticalAlignment = Alignment.CenterVertically){
                FaHouse(modifier = Modifier.margin(5.px))
                SpanText("C/San Mateo 58, 1I, 03013, Alicante")
            }
            Row (modifier = Modifier.onClick { window.location.href = Res.Links.MY_EMAIL }, verticalAlignment = Alignment.CenterVertically){
                FaEnvelope(modifier = Modifier.margin(5.px))
                SpanText("info@pandasfragance.com", modifier = Modifier.textDecorationLine(TextDecorationLine.Underline))
            }
        }
    }
}