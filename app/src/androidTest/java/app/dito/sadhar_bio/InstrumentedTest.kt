package app.dito.sadhar_bio
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import app.dito.sadhar_bio.activity.MainMenuActivity
import junit.framework.TestCase.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class InstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("app.dito.sadhar_bio", appContext.packageName)
    }


    @RunWith(AndroidJUnit4::class)
    class MainMenuActivityTest {

        @get:Rule
        val composeTestRule = createAndroidComposeRule<MainMenuActivity>()

        @Test
        fun redirectToHome_onClickNavigatesToMainActivity() {
            composeTestRule.onNodeWithText("Home").performClick()

            // Verify that MainActivity is launched
            // This part depends on your testing setup, you might use something like Espresso's intended() function
        }

        @Test
        fun redirectToHome_buttonsAreDisplayedCorrectly() {
            composeTestRule.onNodeWithText("Sejarah Universitas Sanata Dharma").assertExists()
            composeTestRule.onNodeWithText("Daftar rektor Universitas Sanata Dharma").assertExists()
            composeTestRule.onNodeWithText("Home").assertExists()
        }
    }
}