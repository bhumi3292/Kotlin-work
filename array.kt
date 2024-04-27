package com.example.a34a

//------------------------array---------------------
fun main(args:Array<String>){
    var age =arrayOf(1,2,3)
    println(age)
    println("Age1 is"+age[0])
    println("Age2:"+age[1])
    println("age3:"+age[2])

    println("-------------+++++-----------")
    var name=arrayOf("Ram","Shyam","Hari")
    name[1]="Bhumi"
    println("The element name is ::"+ name[0])
    println("The element name is ::"+ name[1])
    println("The element name is ::"+ name[2])
    println(name.size)


    //-----------------------------------------------------

    var age1=ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)
    //////////add value directly
    var age2=arrayListOf<Int>(23,24,25)

    var name2 = arrayListOf<String>("Sita","Susm","Sarita")
    name2.add("Hari")
    name2.add(4,"Ram")

    name2.remove("Susm")
    name2.removeAt(0)
    println(name)


    var mixArrayList=arrayListOf<Any>("Hello",3,2.3)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}
