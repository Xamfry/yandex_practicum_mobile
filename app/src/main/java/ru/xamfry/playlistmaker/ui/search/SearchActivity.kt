package ru.xamfry.playlistmaker.ui.search

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.res.stringResource
import ru.xamfry.playlistmaker.R
import ru.xamfry.playlistmaker.ui.components.PlaceholderScreen
import ru.xamfry.playlistmaker.ui.components.setPlaylistContent

class SearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPlaylistContent {
            PlaceholderScreen(stringResource(R.string.search), onBackClick = { finish() })
        }
    }
}
