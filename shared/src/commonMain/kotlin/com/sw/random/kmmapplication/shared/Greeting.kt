package com.sw.random.kmmapplication.shared


class Greeting {
    fun greeting(): String {
        return "Guess what it is! > ${Platform().platform.reversed()}!"
    }
}
