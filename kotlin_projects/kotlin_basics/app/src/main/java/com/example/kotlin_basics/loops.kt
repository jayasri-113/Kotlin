package com.example.kotlin_basics
/*
     Loops
 */
fun main() {
    // to print 3 times message
    var isCount = 3
   while (isCount >= 1){
       println("Intro to loop stnts")
       isCount--
   }
    //example 2
    //this will print simple multiplication table
    var multiplicationTable = 4
    var multiplicationIndex = 1
    while (multiplicationIndex <= 10){
        println(multiplicationTable * multiplicationIndex)
        multiplicationIndex ++
    }
    /*do-While Loop*/
    var index =  6
    do {
       println("its into do while ")
        index--
    }while (index < 4) // if true - do stnts executs

    /*
        for loop
     */
    println("////// For Loop /////")
    for (i in 1..5 ){
        println(i)
    }
    println("////// Step /////")
    for (i in 1 until 5 ){
        println(i)
    }
    println("////// until /////")
    for (i in 1..5 step 2){
        println(i)
    }
    println("////// downto /////")
    for (i in 5 downTo 1){
        println(i)
    }
    println("////// downto  and step by 2/////")
    for (i in 5 downTo 1 step 2){
        println(i)
    }

    println("////// multiplication table /////")
    val multiplicationNumber = 5
    for(i in 1..10){
        //println(multiplicationNumber.toString() + " * "  + i + " = " + (i * multiplicationNumber))

        ////// String Templating /////
        println("$multiplicationNumber x $i = ${i * multiplicationNumber}")
    }

}