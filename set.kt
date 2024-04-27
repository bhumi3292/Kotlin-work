package com.example.a34a

fun main(){

    val numbers = setOf(1, 2, 3, 4)
    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    //---------------------maps--------------
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "India" to "New Delhi",
        "China" to "Beijing"
    )

    println("All Keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")

    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")


    //------------------Immuitable mapping ---------


    val studentMarks = mutableMapOf(
        "ram" to 59,
        "Hari" to 79,
        "Sita" to 45
    )

    println("Enter student name: ")
    val input: String? = readLine()?.lowercase()
    println(studentMarks[input])

    studentMarks["ram"] = 60
    studentMarks["Sabin"] = 80

    println("Enter student name:")
    val input2: String? = readLine()?.lowercase()
    println(studentMarks[input2])


}

