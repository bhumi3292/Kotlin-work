package com.example.a34a

fun main(){
    var a: Int =5
    var b:Int=5

    println("a==b:"+(a==b))
    println("a!=b:"+(a!=b))
    println("a<b:"+(a<b))
    println("a>b:"+(a>b))
    println("a>=b:"+(a>=b))

    var num1:Int=5
    var num2:Int =8
    var num3:Int=12
    var result:Boolean=false;

    //conditional operator
    result=(num1>num2)&&(num3>num2)
    println(result)

    result=(num1>num2)||(num3>num2)
    println(result)


    //BODMAS

    var result2:Int=5+2*4
    println("Result2="+result2)
    result2=(5+2)*4
    println("Result="+result2)
    var x:Int =8
    var y:Int =4
    var z:Int =2
    var sum:Int =0
    sum=x+--y+--z
    println("x+--y+--z:::$sum")

    //range to function

    var myCharRange='a'.rangeTo('j')
    var testCharRange='a'..'j'

    var check='z' in testCharRange
    println("myCharRange has z :$check")
    println(myCharRange)
    println(testCharRange)

    // console Input in android App Development

    println("Enter your name::")
    var name:String?=readln()
    println("Enter age::")
    var age :Int =readln()!!.toInt()




}