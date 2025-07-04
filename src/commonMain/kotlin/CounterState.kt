package com.example.composeapp

class CounterState {
    private var _count: Int = 0
    val count: Int get() = _count

    fun increment() {
        _count++
    }
}
