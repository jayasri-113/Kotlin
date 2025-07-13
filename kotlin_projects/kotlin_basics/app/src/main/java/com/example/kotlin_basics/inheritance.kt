package com.example.kotlin_basics
/*
ONLY ONE CHILD CAN HAVE ONE PARENT - ***** SUPPORTS SINGLE INHERITANCE  ********
 */
fun main() {
    val objChildClass = Child()
    objChildClass.myChildMethod()
    objChildClass.myParentMethod()
}
open class Parent(){
    init {
        println("parent constructor")
    }
    val name:String = ""
    fun myParentMethod(){
        println("in Parent class")
    }
}

class Child():Parent(){
    init {
        println("child constructor")
    }
    val name2:String = ""
    fun myChildMethod(){
        println("in child class")
    }
}
