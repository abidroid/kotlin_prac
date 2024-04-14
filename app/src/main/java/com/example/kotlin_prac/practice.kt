package com.example.kotlin_prac

fun main() {
    // for outputs
    println("Hello World")

    // val is used to declare constants
    val pi: Float = 3.14f
    val gpa: Double = 3.3

    // var is used to declare variables
    var age: Int = 30
    var comments: Int = 484

    // all datatypes
    var count: Byte = 1
    var countries : Short = 200
    var salary: Int = 50000
    var pakDebt: Long = 838383883838383

    var name: String = "Abid"
    var isMarried: Boolean = true

    // String interpolation
    println("Welcome $name")

    val maritalStatus: String =  if ( isMarried)  "Married" else "Not Married"
    println("Your are $maritalStatus")


}