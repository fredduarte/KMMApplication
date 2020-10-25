package com.sw.random.kmmapplication.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("iOS".reversed()), "Check iOS is mentioned")
    }
}