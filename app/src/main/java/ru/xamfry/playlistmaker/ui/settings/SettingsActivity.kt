package ru.xamfry.playlistmaker.ui.settings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.res.stringResource
import ru.xamfry.playlistmaker.R
import ru.xamfry.playlistmaker.ui.components.PlaceholderScreen
import ru.xamfry.playlistmaker.ui.components.setPlaylistContent

class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPlaylistContent {
            PlaceholderScreen(stringResource(R.string.settings), onBackClick = { finish() })
        }
    }
}
