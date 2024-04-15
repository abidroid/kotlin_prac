package com.example.kotlin_prac

fun main() {
    // for outputs
//    println("Hello World")
//
//    // val is used to declare constants
//    val pi: Float = 3.14f
//    val gpa: Double = 3.3
//
//    // var is used to declare variables
//    var age: Int = 30
//    var comments: Int = 484
//
//    // all data types
//    var count: Byte = 1
//    var countries : Short = 200
//    var salary: Int = 50000
//    var pakDebt: Long = 838383883838383
//
//    var name: String = "Abid"
//    var isMarried: Boolean = true
//
//    // String interpolation
//    println("Welcome $name")
//
//    val maritalStatus: String =  if ( isMarried)  "Married" else "Not Married"
//    println("Your are $maritalStatus")
//
//    // user input
//    var n1: Int
//    var n2: Int

//    print("Enter first number : ")
//    n1 = readln().toInt()
//
//    print("Enter second number : ")
//    n2 = readln().toInt()
//
//    println("Sum = ${n1+n2}")

    // Decision making
    var n1: Int
    var n2: Int
    var choice: Int

    print("Enter first number : ")
    n1 = readln().toInt()

    print("Enter second number : ")
    n2 = readln().toInt()


    println("Select Operation")
    println("1. Add")
    println("2. Sub")
    println("3. Mul")
    println("4. Div")
    print("Your choice ? ")
    choice = readln().toInt()

    if( choice == 1 ){
        print("Sum = ${n1+n2}")
    }else if( choice == 2){
        print("Diff = ${n1-n2}")
    }else if( choice == 3 ){
        println("Prod = ${n1*n2}")
    }else if( choice == 4 ){
        println("Quo = ${n1/n2}")
    }else{
        println("Invalid Operation")
    }

}