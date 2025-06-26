package com.firebaseapp.charlieandroidblog.hilt_example

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class MainActivityTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun testIsShown() {
        assertTrue(true)
//        composeTestRule
//            .onNodeWithTag("my_tag") // tag must be set in your Composable
//            .assertExists()
//            .assertTextEquals(myCustomObject.nombre)
    }

}