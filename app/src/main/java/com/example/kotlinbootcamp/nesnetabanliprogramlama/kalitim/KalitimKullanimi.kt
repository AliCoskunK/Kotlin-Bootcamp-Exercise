package com.example.kotlinbootcamp.nesnetabanliprogramlama.kalitim

fun main() {

    val topkapiSarayi=Saray(5,300)
    val bogazVilla=Villa(true,10)

    println(topkapiSarayi.kulesayisi)
    println(topkapiSarayi.penceresayisi)

    println(bogazVilla.garajvarmi)
    println(bogazVilla.penceresayisi)

    if (topkapiSarayi is Saray){
        println("Saraydır")
    }else{
        println("Saray Degildir")
    }

    //UPCASTİNG
    val ev:Ev=bogazVilla

    //DOWNCASTİNG


}