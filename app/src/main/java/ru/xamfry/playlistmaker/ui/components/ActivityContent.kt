package ru.xamfry.playlistmaker.ui.components

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import ru.xamfry.playlistmaker.ui.theme.PlaylistMakerTheme

fun ComponentActivity.setPlaylistContent(content: @Composable () -> Unit) {
    enableEdgeToEdge()
    setContent {
        PlaylistMakerTheme(content = content)
    }
}
