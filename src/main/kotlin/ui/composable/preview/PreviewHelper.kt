package ui.composable.preview

import androidx.compose.ui.graphics.Color
import data.model.Line

object PreviewHelper {

    val lines = sequenceOf(
        Line(
            id = 1,
            nameFa = "یک",
            nameEn = "One",
            color = Color(0xFFC53642),
        ),
        Line(
            id = 2,
            nameFa = "دو",
            nameEn = "Two",
            color = Color(0xFF30577F),
        ),
        Line(
            id = 3,
            nameFa = "سه",
            nameEn = "Three",
            color = Color(0xFF59A7C2),
        ),
        Line(
            id = 4,
            nameFa = "چهار",
            nameEn = "Four",
            color = Color(0xFFE2C21D),
        ),
        Line(
            id = 5,
            nameFa = "پنج",
            nameEn = "Five",
            color = Color(0xFF1A796B),
        ),
        Line(
            id = 6,
            nameFa = "شش",
            nameEn = "Six", color = Color(0xFFF677AA),
        ),
        Line(
            id = 7,
            nameFa = "هفت",
            nameEn = "Seven",
            color = Color(0xFF7C4078),
        ),
    )

}
