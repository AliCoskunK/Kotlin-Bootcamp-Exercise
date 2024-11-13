package com.example.kotlinbootcamp.nesnetabanliprogramlama


    fun main() {
    // Nesne oluşturma
        val bmw = Araba("KIRMIZI", 20, false)

        // Arabanın başlangıç bilgilerini yazdırma
        bmw.bilgial()

        // Arabayı çalıştırma ve hızını ayarlama
        bmw.calistir()

        // Durum bilgisini yazdırma
        bmw.bilgial()

        // Arabayı durdurma
        bmw.durdur()

        // Durum bilgisini yazdırma
        bmw.bilgial()

        // Arabayı tekrar çalıştırma, hızlandırma ve durum bilgisini kontrol etme
        bmw.calistir()
        bmw.hizlan(20)
        bmw.bilgial()

        // Arabayı yavaşlatma ve durum bilgisini kontrol etme
        bmw.yavasla(10)
        bmw.bilgial()
    }