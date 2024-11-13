package com.example.kotlinbootcamp.collections

fun main() {

    val iller=HashMap<Int,String>()
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller[6]="Ankara"
    println(iller)

    println(iller.get(16))


    iller.put(16,"YENİ BURSA")
    println(iller)


    println(iller.size)
    println(iller.isEmpty())


    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)





}