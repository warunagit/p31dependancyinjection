package com.cycolabs.p31dependancyinjection

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Dependancy injection is dependent class receives to its constructer an object of dependencey class
    //Car class with Engine object as parameter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val car = Car()
        //car.start()

        val engine = Engine()
        val car = Car(engine)
        car.start()
    }
}