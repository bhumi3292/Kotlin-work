package com.example.a34a

//Create a Dictionary app using mapOf() function where user will type a word and your program should return the meaning of that word.


fun main() {
    var dictionary = mapOf(
        "apple" to "A fruit",
        "ball" to "gaming tool",
        "cat" to "animal",
        "doll" to "stuff toy"
    )

    println("--------Welcome----------")

    var userInput: String = readln()

    print("Enter a word: ")
    var result = dictionary[userInput]


    println("Meaning: ${dictionary[userInput]}")


}

