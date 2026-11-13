package ru.xamfry.playlistmaker.ui.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LibraryMusic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.xamfry.playlistmaker.R
import ru.xamfry.playlistmaker.ui.theme.PlaylistBlue
import ru.xamfry.playlistmaker.ui.theme.PlaylistMakerTheme

@Composable
fun MainScreen(
    onSearchClick: () -> Unit,
    onPlaylistsClick: () -> Unit,
    onFavoritesClick: () -> Unit,
    onSettingsClick: () -> Unit,
) {
    Surface(color = PlaylistBlue, modifier = Modifier.fillMaxSize()) {
        Column(Modifier.windowInsetsPadding(WindowInsets.safeDrawing)) {
            Text(
                text = stringResource(R.string.app_name),
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 32.dp),
            )
            Surface(
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                modifier = Modifier.fillMaxWidth().weight(1f),
            ) {
                Column(Modifier.verticalScroll(rememberScrollState()).padding(top = 8.dp)) {
                    MenuRow(stringResource(R.string.search), Icons.Default.Search, onSearchClick)
                    MenuRow(stringResource(R.string.playlists), Icons.Default.LibraryMusic, onPlaylistsClick)
                    MenuRow(stringResource(R.string.favorites), Icons.Outlined.FavoriteBorder, onFavoritesClick)
                    MenuRow(stringResource(R.string.settings), Icons.Default.Settings, onSettingsClick)
                }
            }
        }
    }
}

@Composable
private fun MenuRow(label: String, icon: ImageVector, onClick: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .clickable(role = Role.Button, onClick = onClick)
            .heightIn(min = 66.dp)
            .padding(horizontal = 28.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(icon, contentDescription = null, modifier = Modifier.size(24.dp))
        Spacer(Modifier.width(8.dp))
        Text(label, fontSize = 22.sp, fontWeight = FontWeight.Medium, modifier = Modifier.weight(1f))
        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null, tint = Color(0xFFAEAFB4))
    }
}

@Preview(showBackground = true, locale = "ru")
@Composable
private fun MainScreenPreview() {
    PlaylistMakerTheme { MainScreen({}, {}, {}, {}) }
}
