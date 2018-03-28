package org.kotlinacademy.mobile

import android.app.Activity
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers
import android.support.test.espresso.intent.rule.IntentsTestRule
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.MediumTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.kotlinacademy.mobile.view.feedback.FeedbackActivity
import org.kotlinacademy.mobile.view.news.NewsActivity

@MediumTest
@RunWith(AndroidJUnit4::class)
class FabTests {

    @Rule
    @JvmField
    val testRule: ActivityTestRule<NewsActivity> = IntentsTestRule(NewsActivity::class.java)

    @Test
    fun fabDirectsUsToFeedbackActivity() {
        onView(withId(R.id.fab)).perform(click())
        nextOpenActivityIs<FeedbackActivity>()
    }

    private inline fun <reified T : Activity> nextOpenActivityIs() {
        intended(IntentMatchers.hasComponent(T::class.java.name))
    }
}
