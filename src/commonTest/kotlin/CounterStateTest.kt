package com.example.composeapp

import kotlin.test.Test
import kotlin.test.assertEquals

class CounterStateTest {
    @Test
    fun counterIncrements() {
        val state = CounterState()
        state.increment()
        assertEquals(1, state.count)
    }
}
