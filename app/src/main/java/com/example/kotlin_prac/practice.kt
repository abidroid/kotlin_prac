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
//    var n1: Int
//    var n2: Int
//    var choice: Int
//
//    print("Enter first number : ")
//    n1 = readln().toInt()
//
//    print("Enter second number : ")
//    n2 = readln().toInt()
//
//
//    println("Select Operation")
//    println("1. Add")
//    println("2. Sub")
//    println("3. Mul")
//    println("4. Div")
//    print("Your choice ? ")
//    choice = readln().toInt()

//    if( choice == 1 ){
//        print("Sum = ${n1+n2}")
//    }else if( choice == 2){
//        print("Diff = ${n1-n2}")
//    }else if( choice == 3 ){
//        println("Prod = ${n1*n2}")
//    }else if( choice == 4 ){
//        println("Quo = ${n1/n2}")
//    }else{
//        println("Invalid Operation")
//    }

    // Todo: Do the above with when statement


//    when(choice){
//        1 -> print("Sum = ${n1+n2}")
//        2 -> print("Dif = ${n1-n2}")
//        3 -> print("Pro = ${n1*n2}")
//        4 -> print("Quo = ${n1/n2}")
//        else -> print("Invalid Operation Code")
//    }


//    val systemGenNum = (1..100).random();
//
//
//    print("A number has been generated from 1 to 100\nTry to guess it")
//
//    while (true){
//         print("Enter your guess : ")
//        val userGuess = readln().toInt();
//
//        if( userGuess > systemGenNum){
//            print("Your guess is high, try again")
//        }else if( userGuess < systemGenNum){
//            print("Your guess is low, try again")
//        }else{
//            break;
//        }
//    }
//    println("Congratulations, you have guessed the number")

    // Loops

//    print("Enter a number : ")
//    val num: Int = readln().toInt();
//
//    // Note: There is no traditional for loop in Kotlin
//    for( i in 1..10 ){
//        println("$num X $i = ${num*i}")
//    }

//    var num1: Int
//    var num2: Int
//    var choice: String
//
//    do{
//        print("Enter first number : ")
//        num1 = readln().toInt()
//        print("Enter second number : ")
//        num2 = readln().toInt()
//        println("Sum = ${num1+num2}")
//
//        print("Do you want more additions(yes/no) ? ")
//        choice = readln()
//
//
//    }while (choice == "yes")

    // Todo: Simple Arrays
    // Todo: https://kotlinlang.org/docs/arrays.html#create-arrays
//    val simpleArray = arrayOf(1, 2, 3)
//    println(simpleArray.joinToString())

    // Todo: Array of nulls
//    val nullArray: Array<Int?> = arrayOfNulls(3);
//    println(nullArray.joinToString())

    // Todo: Note Both are valid syntax
//    var emptyArray1 = emptyArray<String>()
//    var emptyArray2: Array<String> = emptyArray()


    // Note - All above use functions
    // Now we will use Array constructor
    // Creates an Array<Int> that initializes with zeros [0, 0, 0]
    /*
    val initArray = Array<Int>(3) { 0 }
    println(initArray.joinToString())


    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print("$it ") }

     */

    // Todo: Collections
    /*
    The Kotlin Standard Library provides implementations for basic collection types: sets, lists, and maps.
    A pair of interfaces represent each collection type:

A read-only interface that provides operations for accessing collection elements.

A mutable interface that extends the corresponding read-only interface with write operations:
adding, removing, and updating its elements.
     */

    /*
      val numbers = mutableListOf("one", "two", "three", "four")
      numbers.add("five")   // this is OK
      println(numbers)
  //numbers = mutableListOf("six", "seven")      // compilation error
      */

    /*
    val shoppingList = mutableListOf("milk", "honey", "sugar")
    shoppingList.add("bread")
    println(shoppingList.size)
    shoppingList.removeAt(0)
    println(shoppingList)

    // immutable list - read only
    val friends: List<String> = listOf("Ali", "Khan", "Bilal", "Riaz")

    println(friends)

    */


    /*
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    println(numbers)
    numbers.shuffle()
    println(numbers)
    */

    // Todo: Set
    /*
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if(numbers.contains(1)) println("1 is in the set")

    val numbersBackward = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackward}")
    */

    // Todo: HashMap
    /*
    var playersJersey: HashMap<String, Int> = HashMap()
    playersJersey["afridi"] = 10
    playersJersey.put("ronaldo", 7)
    playersJersey.put("kohli", 47)
    println(playersJersey)

    for( key in playersJersey.keys){
        println("Jersey of $key is ${playersJersey[key]}")
    }
    */

    // Todo: Functions
    /*
    displayStars()
    displayChar('#')
    sum(4, 5)
    println(sum(3.3, 4.4))

     */

    /*
    var student = Student()
    student.name = "Ali"
    student.course = "Flutter"
    student.mobile = "03329964494"
    student.cnic = "1730150661833"
    student.display()

     */

    /*
    var flutter = Book("Flutter", "Abid", 500, 400.5)
    flutter.displayBook()
    */

    // Todo: Inheritance
    /*
    var student = Student("Abid", "Male", "1st Nov", "Flutter")
    student.display()

     */

    /*


    val post1 = Post("1", "Abid", "Kotlin is best")
    val post2 = Post("2", "Ali", "Flutter is best")

    println(post1)
    println(post2)
    print(post1 == post2)

     */

    // Todo: Polymorphism
    /*
    val tony: Animal = Dog()
    tony.eat()
    tony.sleep()
    tony.sound()

    val mano : Animal = Cat()
    mano.eat()
    mano.sleep()
    mano.sound()

    val cheetah: Animal = Tiger()
    cheetah.eat()
    cheetah.sleep()
    cheetah.sound()

     */

    // Todo: Exception Handling
    print("Enter a number : ")
    val num = readln().toInt()
    print("Enter second number : ")
    val num2 = readln().toInt()

    val quo = num / num2
    println("Quotient = $quo")

    println("Weldone")
    println("Kotlin is good")
    println("Thank You")
}


fun displayStars() {
    print("**********************************");
    println()
}

fun displayChar(symbol: Char) {
    var i: Int = 1;
    while (i < 21) {
        print(symbol)
        i++
    }
    println()
}

fun sum(n1: Int, n2: Int) {
    println("Sum = ${n1 + n2}")
}


// function overloading
// Single Line
fun sum(n1: Double, n2: Double) = n1 + n2

/*
class Student {
    var name: String = ""
    var course: String = ""
    var mobile: String = ""
    var cnic: String? = null

    fun display() {
        println("Name: $name")
        println("Course: $course")
        println("Mobile: $mobile")
        println("CNIC: $cnic")
    }
}
*/

class Book(
    private var title: String,
    private var author: String,
    private var pages: Int,
    private var price: Double,
) {

    // init is used to execute code upon object creation
    init {
        println("Book Created")
    }

    fun displayBook() {
        println("Title: $title");
        println("Author: $author")
        println("Pages: $pages")
        println("Price: $price")
    }
}

// Base Class
open class Person(var name: String, var gender: String, var dob: String) {

    open fun display() {
        println("Name: $name")
        println("Gender: $gender")
        println("DOB: $dob")
    }
}

// Derived Class
class Student(name: String, gender: String, dob: String, var course: String) :
    Person(name, gender, dob) {

    override fun display() {
        super.display()
        println("Course: $course")

    }

}

/*
Data classes are a feature in Kotlin that helps you to create classes solely to hold data.
They often replace traditional POJOs (Plain Old Java Objects) in Java.
 */
data class Post( val postId: String, val postedBy: String, val text: String)

abstract class Animal {
    fun eat() = println("Eating...")
    fun sleep() = println("Sleeping...")
    abstract fun sound()
}

class Dog : Animal() {
    override fun sound() = println("Barking...")
}

class Cat : Animal() {
    override fun sound() = println("Meowing...")

}

class Tiger : Animal() {
    override fun sound() = println("Roaring...")
}