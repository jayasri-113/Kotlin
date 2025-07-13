package com.example.kotlin_basics

fun main() {
    /*
        arthematic operators
    */
    var i = 13
    var j = 2
    println("Arthematic operators")
    println(i + j)
    println(i - j)
    println(i * j)
    println(i.toFloat() / j)
    println(i % j)

    /*
        relational operators
    */
    println("Relational operators")
    println(i > j)
    println(i < j)
    println(i >= j)
    println(i <= j)
    println(i == j)
    println(i != j)

    /*
        post and pre increment/decrement
     */

    println("increment and decrement operators")
    println(i++) //this is similar to i = i + 1
    println(i--) //this is similar to i = i - 1
    println(++i)
    println(--i)
    println(i++ + ++i)// 13 + 15

    /*
        Logical Operators
     */
    val above70: Boolean = false
    val knowsProgramming:Boolean = true
    println("Logical operators")

    // && AND- only when both true results true
    var   callForInterview = above70 && knowsProgramming
    println(callForInterview)

    // || OR - any true results true
    callForInterview = above70 || knowsProgramming
    println(callForInterview)

    /*
        this is called short circuting
     */
    println("Short Circuting")
    var k = 5
    var l = 6
    // first stnt is false but checks for second stnt
    // since its a OR operator
    var result = k == 8 || l++ == 7
    //var result = k == 5 && l++ == 7
    println(k)
    println(l)


    /*
        ! Operator
     */
    println("NOT operator")
    val isRaining = false
    val stnt = !!isRaining
    println(stnt)
}


