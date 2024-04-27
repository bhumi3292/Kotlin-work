package com.example.a34a

fun main(){
    println("Please enter a number:")
    var number:Any =readln()!!.toInt()
    if(number.toString().toInt()%2==0){
        println("$number is even")
    }else{
        println("$number is odd")


        //IF Else _if ladder

        println("Pleuase enter 0your age::")
        var yourAge:Int =readln()!!.toInt()
        if(yourAge<13){
            println("You are a child")
        }else if (yourAge<19){
            println("You are a teeneger")

        }else{
            if(yourAge<50){
                println("You are an adult")
            }else{
                println("You are a senior citizen")
            }
        }
    }


    //Nested If Statement

    println("Please Enter 3 numbers:")

    var num1:Int= readln()!!.toInt()
    var num2:Int= readln()!!.toInt()
    var num3:Int= readln()!!.toInt()
    var largestNumber:Int
    if(num1>num2){
        if(num1>=num3){
            largestNumber=num1
        }else{
            largestNumber=num3
        }

    }else{
        if(num2>=num3){
            largestNumber=num2
        }else{
            largestNumber=num3
        }
    }
    println("The largest number is $largestNumber")



    //When Statement-------------

    println("Please enter a day numeber of week:")
    var dayNumber: Int=readln().toInt()
    var day:String
    when(dayNumber)
    {
        1->day="Sunday"
        2->day="Monday"
        3->day="Tuesday"
        4->day="Wednesday"
        5->day="Thursday"
        6->day="Friday"
        7->day="Saturday"
        else ->day="Invalid day choice"
    }
    println(day)








}