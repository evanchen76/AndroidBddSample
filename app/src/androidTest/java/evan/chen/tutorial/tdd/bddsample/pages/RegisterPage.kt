package evan.chen.tutorial.tdd.bddsample.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import cucumber.api.java.Before
import evan.chen.tutorial.tdd.bddsample.MainActivity;
import evan.chen.tutorial.tdd.bddsample.R

class RegisterPage {

    var testRule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java, false, false)

    //開啟註冊頁面
    fun launchScreen() {
        testRule.launchActivity(null)
    }

    //輸入帳號
    fun typeLoginId(loginId: String) {
        onView(withId(R.id.loginId)).perform(typeText(loginId), ViewActions.closeSoftKeyboard())
    }

    //輸入密碼
    fun typePassword(password: String) {
        onView(withId(R.id.password)).perform(typeText(password), ViewActions.closeSoftKeyboard())
    }

    //點註冊按鈕
    fun tapRegisterButton() {
        onView(withId(R.id.send)).perform(ViewActions.click())
    }
}
