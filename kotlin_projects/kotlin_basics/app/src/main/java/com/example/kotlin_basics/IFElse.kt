package com.example.kotlin_basics
/*
    IF - ELSE
 */
fun main() {
    //example 1
    val isRaining = false
    if (isRaining){
        println("Its Raining .......")
    }else{
        println("Can continue walking...")
    }
    //example 2

    val x = 10
    val y = 13
    if(x > y){
        println("x is greater")
    }else if(x < y){
        println("y is greater")
    }else{
        println("x is equal y")
    }

    /*
        Using variable assigning
     */
        //example 1
    println(" Using variable assigning ")
    val result = if(x > y){
        "x is greater"
    }else if(x < y){
        "y is greater"
    }else{
        "x is equal y"
    }
    println(result)


    //example 2 - odd or even
    println(" Single line usage IF ELSE ")
    val number = 13
    val isEvenOrOdd = if(number % 2 == 0) "Even" else "Odd" // no Ternery  operator in Kotlin
    println(isEvenOrOdd)
}