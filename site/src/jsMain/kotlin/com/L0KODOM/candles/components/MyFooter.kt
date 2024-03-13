package com.L0KODOM.candles.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Footer(){
    Column(modifier = Modifier.fillMaxWidth()
        .padding (10.px)
        .background(Colors.BlanchedAlmond),
        horizontalAlignment = Alignment.CenterHorizontally) {

        P {
            Text("CONTACTO")
        }
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround){

            P {
                Text("664419949")
            }
            P {
                Text("C/San Mateo 58, 1I, 03013, Alicante")
            }
            P {
                Text("info@pandasfragance.com")
            }

        }

    }
}