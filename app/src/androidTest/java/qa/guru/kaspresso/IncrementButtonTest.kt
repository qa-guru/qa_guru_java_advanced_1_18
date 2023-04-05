package qa.guru.kaspresso

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.components.alluresupport.withAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class IncrementButtonTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.simple()
) {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun incrementButtonShouldIncreaseValue() = run {
        step("Launch the app") {
            MainScreen {
                incrementButton.isDisplayed()
                incrementButton {
                    repeat(5) {
                        click()
                    }
                }
                valueText.hasText("Count: 5")
            }
        }
    }

}