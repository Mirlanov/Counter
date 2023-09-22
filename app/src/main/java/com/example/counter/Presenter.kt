package com.example.counter

import android.graphics.Color

class Presenter constructor(val view: CounterView) {
    private val model = Injector.getModel()
    fun increment() {
        model.increment()
        view.showCounter(model.count)
        if (model.count == 10) {
            view.showToast("Поздравляем")
        }
        if (model.count == 15) {
            view.changeColor(Color.GREEN)
        }

    }

    fun decrement() {
        model.decrement()
        view.showCounter(model.count)
        if (model.count == 14) {
            view.changeColor(Color.BLACK)
        }
    }
}