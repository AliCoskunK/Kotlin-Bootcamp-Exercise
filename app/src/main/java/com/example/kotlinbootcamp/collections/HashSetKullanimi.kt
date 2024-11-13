package com.example.kotlinbootcamp.collections

fun main() {

    val meyveler=HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)   //içeriği değiştirerek yazıyor

    meyveler.add("Amasya elması")
    println(meyveler)

    println(meyveler.elementAt(1)) //karıştırmasına rağmen kendine ait bir indeks yapısı var
    //indeks 1 de ne olduğunu yazdırdım

    println(meyveler.size)
    println(meyveler.isEmpty())


    for (m in meyveler){
        println("Sonuç:$m")
    }


    for ((i,m) in meyveler.withIndex()){
        println("$i. -> $m")
    }

    meyveler.remove("elma") //istediğim elementi sildi
    println(meyveler)

    meyveler.clear() //içeriği sildi
    println(meyveler)






}