package com.example.kotlin_basics

fun main() {
    /*
        Range
     */
    //example 1
    val performanceScale = 10
    val isPerformance = performanceScale in 1..10
    val isPerformance_usinguntil = performanceScale in 1 until 10
    println("Checking within Range")
    println(isPerformance)
    println(isPerformance_usinguntil)

    //example 2
    //many conditions
    val dept = "CSE"
    if(dept == "CSE"){
        println("its CSE dept")
    }else if(dept == "IoT"){
        println("its IoT dept")
    }else if(dept == "MECH"){
        println("its MECH dept")
    }else if(dept == "CIVIL"){
        println("its CIVIL dept")
    }else{
        println("dept not found")

    }
    // cutting short using when
    // assign to variable to print
    println("//////   using when  ////")
    val isDept = when(dept){
        "CSE"   ->  "its CSE dept"
        "IoT"   ->  "its IoT dept"
        "MECH"  ->  "its MECH dept"
        "CIVIL" ->  "its CIVIL dept"
        else    ->  "dept not found"
    }
    println(isDept)

    //another example
    val ofAge = 12
    var ageGroup = when(ofAge){
        in 1..10 -> "too teen not eligible"
        in 20..25 -> "eligible"
        else -> "Not Applicable !!!"
    }
    println(ageGroup)
}