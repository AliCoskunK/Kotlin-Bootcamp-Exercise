package com.example.kotlinbootcamp.nesnetabanliprogramlama

class Calculator(){

    fun toplama(sayi1:Int,sayi2:Int):Int{
        val sonuc=sayi1+sayi2
        return sonuc
    }

    fun cikarma(sayi1:Int,sayi2:Int):Int{
        val sonuc=sayi1-sayi2
        return sonuc
    }

    fun carpma(sayi1:Int,sayi2:Int):Int{
        val sonuc=sayi1*sayi2
        return sonuc
    }

    fun bolme(sayi1:Int,sayi2:Int):Long{
        val sonuc=sayi1/sayi2
        return sonuc.toLong()
    }
    fun mltokm(km:Double):Double{
        val sonuc=km*0.621371
        return sonuc.toDouble()
    }
    fun ucgencevre(kenar1:Int,kenar2:Int,kenar3:Int):Int{
        val sonuc=kenar1+kenar2+kenar3
        return sonuc

    }
    fun dikdortgenalan(kisakenar:Int,uzunkenar:Int):Int{
        val sonuc=kisakenar*uzunkenar
        return sonuc
    }
    fun calculateFactorial(n: Int): Long {
        var factorial: Long = 1
        for (i in 1..n) {
            factorial *= i
        }
        return factorial
    }




}