package com.firebaseapp.charlieandroidblog.hilt_example.ui

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import java.util.concurrent.ThreadLocalRandom

class UtilsUi {
    companion object{

        fun getColorBlue1() = Color(0xFF2C2C81)
        fun getColorGreen() = Color(0xFF408C4B)
        fun getColorBlue2() = Color(0xFF3030AF)
        fun getColorBlue3() = Color(0xFF2828BA)
        fun getColorRed1() = Color(0xFF880D0D)
        fun getColorGreen1() = Color(0xFF315537)
        fun getLightBlue() = Color(0xFF5252FF)
        fun getColorWhite1() = Color(0xFFFFFFFF)
        fun getColorWhite2() = Color(0xFFD0D0D0)
        fun getColorAlmostWhite() = Color(0xFFE3E3E3)
        fun getColorAlmostWhite2() = Color(0xFFD1D1D1)
        fun getColorAlmostBlue() = Color(0xFF8B9AFF)
        fun getColorAlmostBlack() = Color(0xFF2B2B2B)

        fun getColor4Layot(cont:Int): Color{

            return when (cont) {
                1 -> Color(0xFF7B1818)
                2 -> Color(0xFF151A80)
                3 -> Color(0xFF3C730E)
                4 -> Color(0xFF7A1F95)
                5 -> Color(0xFFB5820F)
                6 -> Color(0xFF206362)
                7 -> Color(0xFF354071)
                8 -> Color(0xFF632042)
                9 -> Color(0xFF0E5E5E)
                10 -> Color(0xFF6C4B93)
                11 -> Color(0xFF955436)
                12 -> Color(0xFF3E6F9E)
                13 -> Color(0xFF408C4B)
                14 -> Color(0xFF8C2F4F)
                15 -> Color(0xFF5C5C88)
                16 -> Color(0xFF9E682D)
                17 -> Color(0xFF2F6A5C)
                18 -> Color(0xFF583E73)
                19 -> Color(0xFF834E20)
                else -> Color(0xFF703B57) // Default color
            }
        }

        fun getRandomColor(): Color{
            val randomNum = ThreadLocalRandom.current().nextInt(1, 10)

            val c =  Color(0xFF408C4B)
            return getColor4Layot(randomNum)
        }


        fun getBrushGradient(): Brush {
            return Brush.horizontalGradient(
                colors = listOf(getLightBlue(),getColorRed1()),
                startX = 0.5f,
                endX = 1f
            )
        }

        fun getGoodOrBadColor(index:Int, size:Int): Color {
            return if (index<size)
                getColorGreen()
            else
                Color(0xFF7B1818)
        }
    }
}