
package com.example.kotlin_basics
/*
    Classes and Objects
 */
fun main() {
    val ferrari = Car ( brand = "Ferrari", type = "petrol" , mileage = 100)
    val bmw = Car ( brand = "BMW", type = "diesel" , mileage = 200)
    println(ferrari.type)
    println(bmw.brand)

    //function methods
    println( ferrari.driveCar())
}

class Car (val brand: String, val type: String, var mileage: Int){ //properties
    //methods of class
    fun driveCar(){
        println(" $brand car is driving")
    }
    fun apllyBrake(){
        println("apllied Brake")
    }
}
