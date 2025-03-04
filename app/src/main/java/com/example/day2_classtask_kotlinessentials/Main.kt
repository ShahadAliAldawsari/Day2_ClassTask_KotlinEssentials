package com.example.day2_classtask_kotlinessentials.ui.theme

fun main() {
    var name: String = "Shahad"
    var age: Int = 5
    var femal: Boolean = true

    var myList = listOf(5, 2, 6, 4, 1, 3)
    println("my list: " + myList)
    println("sorted list: " + myList.sorted())

    if (femal) {
        println("Good morning Ms." + name + " you are " + age + " years old")
    } else {
        println("Good morning Mr." + name + " you are " + age + " years old")
    }
    profile(name, age, "Female")
}
// // Syntax of Lambda expression:
//    val lambda_name : Data_type = {
//    argument_List -> code_body
//    }

val profile = {name: String, age: Int , gender: String->
    println("\n----Your Profile----\nThe name: "+name+"\nThe age: "+age+"\nThe gender: "+gender)
}
