package com.example.kotlinbootcamp.nesnetabanliprogramlama

fun main() {
    //Nullable-Null safety-Optional(Swift)

    var x = "merhaba"

    //TANIMLAMA

    var str:String?=null //NULL OLABİLİR ANLAMINA GELİYOR

   str="Merhaba"

    //KULLANIMI YÖNTEM 1

    println("Yöntem 1: ${str?.trim()}")

    //KULLANIMI YÖNTEM 2
   // println("Yöntem 2: ${str!!.trim()}")//null olmayacak güveniyorum anlamına geliyor İki!

    //KULLANIMI YÖNTEM 3
    if (str!=null)
    {
        println("Yöntem 3: ${str.trim()}")
    }
    else
    {
        println("Yöntem 3: NULL")
    }

    //KULLANIMI YÖNTEM 4
    str?.let {
        println("Yöntem 4: ${str.trim()}")
    }



}