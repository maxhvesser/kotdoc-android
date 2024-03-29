package no.mhl.kotdoc.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import no.mhl.kotdoc.R

// region Font Families
val Manrope = FontFamily(
    Font(R.font.manrope_extralight, FontWeight.ExtraLight),
    Font(R.font.manrope_light, FontWeight.Light),
    Font(R.font.manrope_regular, FontWeight.Normal),
    Font(R.font.manrope_medium, FontWeight.Medium),
    Font(R.font.manrope_semibold, FontWeight.SemiBold),
    Font(R.font.manrope_bold, FontWeight.Bold),
    Font(R.font.manrope_extrabold, FontWeight.ExtraBold)
)

val JetBrainsMono = FontFamily(
    Font(R.font.jet_brains_mono_regular, FontWeight.Normal)
)

val Inter = FontFamily(
    Font(R.font.inter_extralight, FontWeight.ExtraLight),
    Font(R.font.inter_light, FontWeight.Light),
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_semibold, FontWeight.SemiBold),
    Font(R.font.inter_extrabold, FontWeight.ExtraBold),
)
//endregion

val typography = Typography(defaultFontFamily = Manrope)

// region Markdown Typography
val MarkdownH1 = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = 20.sp,
    fontFamily = Inter
)

val MarkdownH2 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 18.sp,
    fontFamily = Inter
)

val MarkdownH3 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 16.sp,
    fontFamily = Inter
)

val MarkdownBody1 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    fontFamily = Inter
)

val MarkdownCode = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    fontFamily = JetBrainsMono
)
// endregion