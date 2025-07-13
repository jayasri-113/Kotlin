package com.example.kotlin_basics
/*
    Array
 */
fun main() {
    var arr:Array<String> = arrayOf("one", "two", "three") // String Array
    var arr1:Array<Int> = arrayOf(1,2,3) // Numeric Array
    var arr2:Array<Int> =  arrayOf<Int>(1,2,3)

    //print the array elements
    println("print the array elements")
    for (i:String in arr){
        println(i)
    }

    //printing the array and index
    println("printing the array and index")
    for((i:Int, arr_index:String) in arr.withIndex()){
        println("$i - $arr_index")
    }

    // print particular index
    println("print particular index")
    println(arr[0])
    println(arr.get(1))

    // set array value
    println("set array value")
    arr.set(0,"Hllo")
    println(arr[0])

    // get the size of array
    println("get the size of array")
    println(arr.size)

    // outofbound exception
    println("outofbound exception")
    println(arr[3])

}