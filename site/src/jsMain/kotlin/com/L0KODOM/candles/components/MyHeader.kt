package com.L0KODOM.candles.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaCartShopping
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MyHeader(){
    Row (verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround){
        P (
            attrs = Modifier.fontSize(20.px).toAttrs()
        ){
            Text("PERSONALIZA")
        }
        Box (modifier = Modifier.width(2.5.percent))
        P (
            attrs = Modifier.fontSize(40.px).toAttrs()
        ){
            Text("PANDAS FRAGANCE")
        }
        Box (modifier = Modifier.width(20.percent)){
            Row (horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()){
                P (
                    attrs = Modifier.fontSize(20.px).toAttrs()
                ){
                    Text("CONTACTO")
                }
                Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End){
                    FaCartShopping(modifier = Modifier.margin (5.px),
                        size = IconSize.XL)
                    P (
                        attrs = Modifier.fontSize(20.px).toAttrs()
                    ){
                        Text("SHOP")
                    }
                }
            }
        }
    }
}