package ru.xamfry.playlistmaker.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import ru.xamfry.playlistmaker.R
import ru.xamfry.playlistmaker.ui.search.SearchActivity
import ru.xamfry.playlistmaker.ui.settings.SettingsActivity
import ru.xamfry.playlistmaker.ui.components.setPlaylistContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPlaylistContent {
            MainScreen(
                onSearchClick = { startActivity(Intent(this, SearchActivity::class.java)) },
                onSettingsClick = { startActivity(Intent(this, SettingsActivity::class.java)) },
                onPlaylistsClick = { showButtonToast(R.string.playlists) },
                onFavoritesClick = { showButtonToast(R.string.favorites) },
            )
        }
    }

    private fun showButtonToast(label: Int) {
        Toast.makeText(this, getString(R.string.button_pressed, getString(label)), Toast.LENGTH_SHORT).show()
    }
}
