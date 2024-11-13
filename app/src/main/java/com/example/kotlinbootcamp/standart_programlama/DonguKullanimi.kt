package com.example.kotlinbootcamp.standart_programlama

fun main() {
    //1,2,3
    for (i in 1..3){
        println("Döngü 1: $i")

    }

    //10 ile 20 arasında 5 er 5 er artsın

    for (a in 10..20 step 5){
        println("Döngü 2: $a")
    }


    //20 ile 10 arası 5 er 5 ezalsın
    for (b in 20 downTo 10 step 5){
        println("Döngü 3: $b")
    }

    //1,2,3,4,5
    var sayac=1
    while (sayac<6){
        println("Döngü 4: $sayac")
        sayac++
    }

    //break ve continue kullanımı

    for (i in 1..5){
        if (i==3 || i==2){
            continue //var olan adımı pas geçiyor break var olan adıma gelince duruyor
        }
        println("Döngü 5:$i")

    }
















}