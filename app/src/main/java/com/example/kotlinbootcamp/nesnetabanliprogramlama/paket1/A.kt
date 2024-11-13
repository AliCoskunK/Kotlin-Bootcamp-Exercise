package com.example.kotlinbootcamp.nesnetabanliprogramlama.paket1

open class A {
    var varsayilanDegisken=1 //public ile aynı heryerden erişilebilir
    public var publicDegisken=2 // publicheryerden erişilebilir
    private var privateDegisken=3 //sadece class içerisinden erişilebilir
    internal var internalDegisken=4 //
    protected var protectedDegisken=5 // kalıtım yoluyla erişilebilir

    //private olana sadece class içerisinden erişim sağlanıyor


    fun fonksiyon1(){
        println(privateDegisken)
    }


}