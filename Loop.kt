package com.example.a34a

import kotlin.random.Random

fun main(){
    //For Loop--------------
    for(i in 1 ..9){
        println(i)
    }
    var sum: Int =0
    for(x in 0 ..5) {


        println(x)
        sum += x
    }
    println("The sum of the even number is $sum")

    var vehicle=arrayListOf<String>("Tata","Kia","Humdai","MG")
    for(y in vehicle.indices){
        println("The value in $y index is : - ${vehicle[y]}")

        }

    //------While loop-----------
    var i:Int=0;
    while (i<5){
        println(i)
        i++
    }
    var k=1
    var fact=1
    while(k<6){
        fact*=k;
        println("$k!=$fact")
        k++
    }
    //---------------Infinite Loop------------

    var number= Random.nextInt(0,100000)
    println("Entter the number::")
    while(2>1){
        var userGuess:Int=readln()!!.toInt()
        if(userGuess==number){
            println("Congratulations,You won")
            break
        }else if(userGuess<number){
            println("Increase your guess")
        }else{
            println("Decrease your guess")
        }
    }

    //----------Do_While Loop-----------
    var num=1
    do{
        println(num)
        num++

    }while(num<=15)

}