package ru.xamfry.playlistmaker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val PlaylistBlue = Color(0xFF3772E7)
private val PlaylistColors = lightColorScheme(
    primary = PlaylistBlue,
    background = Color.White,
    surface = Color.White,
    onSurface = Color(0xFF1A1B22),
)

@Composable
fun PlaylistMakerTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = PlaylistColors, content = content)
}
