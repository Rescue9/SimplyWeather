package com.corridor9design.simplyweather.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Setting up Font
val PublicSansLight = FontFamily(Font(R.font.publicsans_light))
val PublicSansRegular = FontFamily(Font(R.font.publicsans_regular))
val PublicSansBold = FontFamily(Font(R.font.publicsans_bold))

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = PublicSansBold,
        fontSize = 88.sp,
        letterSpacing = 0.5.sp
    ),
    subtitle1 = TextStyle(
        fontFamliy = PublicSansBold,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontFamily = PublicSansLight,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    body2 = TextStyle(
        fontFamly = PublicSansBold,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    caption = TextStyle(
        fontFamily = PublicSansRegular,
        fontSize = 10.sp,
        letterSpacing = 0.sp
    )        
)