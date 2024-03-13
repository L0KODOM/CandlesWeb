package com.L0KODOM.candles.components

import androidx.compose.runtime.Composable
import com.L0KODOM.candles.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
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

@Composable
fun ProductCard(name:String,description: String, image: String){

    val breakpoint = rememberBreakpoint()

    SimpleGrid(numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint <= Breakpoint.MD) 100.percent
                else Res.Dimens.MAX_CARD_WIDTH.px
            )
            .thenIf(
                breakpoint> Breakpoint.MD,
                other = Modifier.height(Res.Dimens.MAX_CARD_HEIGHT.px)
            )
            .boxShadow(color = Colors.Black.copy(alpha = 10),
                blurRadius = 50.px,
                spreadRadius = 50.px)
            .padding (12.px)
            .margin (12.px)
            .borderRadius(5.percent)
            .background(Colors.BlanchedAlmond)){
        LeftPart(breakpoint, image)
        RightPart(name, description)

    }
}
@Composable
fun RightPart(name: String, description:String){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        SpanText(
            text = name,
            modifier = Modifier
                .margin(10.px)
                //.textDecorationLine(TextDecorationLine.Underline)
                .fontWeight(FontWeight.Bold)
        )
        SpanText(
            text = description
        )
    }

}
@Composable
fun LeftPart(breakpoint: Breakpoint, image:String){
    Box (modifier = Modifier.fillMaxWidth()
        .thenIf(
            breakpoint> Breakpoint.MD,
            other = Modifier.height((Res.Dimens.MAX_CARD_HEIGHT-24).px)
        )){
        Image(modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover)
            .borderRadius(8.px),
            src = image)
    }
}
