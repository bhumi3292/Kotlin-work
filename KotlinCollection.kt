package com.example.a34a

fun main() {
    //--------------list--------------
    val numbers : List<String> = listOf("One","Two","Three","Four")

    println("Number of Elements:${numbers.size}")
    println("Third Elements:${numbers.get(2)}")
    println("Fourth Elements:${numbers[3]}")
    println("Index of Elements \"two\" ${numbers.indexOf("two")}")


//---------------------------mutable and unmutable list------------------------
val lst = listOf("1","2","3")
    println("-----Mutable List--------")
    for(i in lst.indices){
        println(lst[i])
    }
    println()

    val mutableLst=mutableListOf("1","2","3")
    mutableLst.add("4")
    println("-------Immutable List-------")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }
}

