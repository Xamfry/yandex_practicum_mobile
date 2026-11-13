package ru.xamfry.playlistmaker

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.espresso.Espresso.pressBack
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.xamfry.playlistmaker.ui.main.MainActivity

@RunWith(AndroidJUnit4::class)
class MainNavigationTest {
    @get:Rule
    val compose = createAndroidComposeRule<MainActivity>()

    @Test
    fun searchOpensAndSystemBackReturnsToMenu() {
        compose.onNodeWithText("Поиск").performClick()
        compose.onNodeWithContentDescription("Назад").assertIsDisplayed()
        compose.onNodeWithText("Поиск").assertIsDisplayed()
        pressBack()
        compose.onNodeWithText("Playlist maker").assertIsDisplayed()
        compose.onNodeWithText("Настройки").assertIsDisplayed()
    }

    @Test
    fun settingsOpensAndToolbarBackReturnsToMenu() {
        compose.onNodeWithText("Настройки").performClick()
        compose.onNodeWithContentDescription("Назад").assertIsDisplayed().performClick()
        compose.onNodeWithText("Playlist maker").assertIsDisplayed()
        compose.onNodeWithText("Поиск").assertIsDisplayed()
    }
}
