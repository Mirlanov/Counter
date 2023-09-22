package com.example.counter

interface CounterView {
    fun showCounter(count: Int)
    fun showToast(msg: String)
    fun changeColor(color: Int)
}