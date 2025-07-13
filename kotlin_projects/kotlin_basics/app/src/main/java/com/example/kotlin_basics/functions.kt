package com.example.kotlin_basics
/*
    Functions
 */
fun main() {
    //basic function call
    println("basic function call")

    val result = add(number1 = 6, number2 = 9) // arguments
    println("sum is " + result)

    println("single parameter function call")
    val checkEvenOrOdd = evenOrOdd(number1 = 89)
    println(checkEvenOrOdd)

    println("setting default parameter function call")
    displayMessage( 5 )
    displayMessage()

    //overloading function call
    println("overloading function call")
    //println(addition(number1 = 8, number2 = 9)) // named arguments
   // println(addition(number1 = 6.0, number2 = 9.1))

    //store function in variable
    println("store function in variable")
    //var fn_var: KFunction2<Double, Double, Double> =::addition
    //println(fn_var(10.0, 20.9))

}
/*
    function for addiiton of 2 numbers with 2 parameters
 */
fun add(number1:Int , number2: Int) : Int{
    val isSum = number1 + number2
    return isSum
}
//addition can also be written as
//fun add(number1:Int , number2: Int) =  number1 + number2
/*
  function even or odd
  function of no return stnt
  function type  - Unit
 */
fun evenOrOdd(number1: Int){ //fun evenOrOdd(number1: Int):Unit
    val isEvenOrOdd = if(number1 % 2 == 0) "Even" else "Odd"
    println("the number is " + isEvenOrOdd)
}

/*
    set default value
 */
// you cant change the parameter value since it creates as val type
fun displayMessage(count:Int = 3){
    for(i in 1..count){
        println("printing count  $i ")
    }
}

/*
    function overloading - same name different parameters(no of parameters / type of parameters)
 */
/*fun addition(number1:Int , number2: Int) : Int{
    return number1 + number2
}*/
fun addition(number1:Double , number2: Double) : Double{
    return number1 + number2
}

