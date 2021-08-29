package com.example.weather

fun  TestClass () {
  /*  var hello: String = "hello function"

    println(hello)*/

    hello("world")
}

fun hello(text:String = "default message"): String {
    println(text)
    return text
}