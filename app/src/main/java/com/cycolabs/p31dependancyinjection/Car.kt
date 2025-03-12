package com.cycolabs.p31dependancyinjection

//dependent - which is referenced from
class Car(private val engine: Engine) {

    //dependencies - which are referenced as required
    //private val engine = Engine()

    fun start(){
        engine.startEngine()
    }
}