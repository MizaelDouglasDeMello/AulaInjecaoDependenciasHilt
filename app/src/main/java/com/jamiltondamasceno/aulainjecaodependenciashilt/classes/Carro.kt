package com.jamiltondamasceno.aulainjecaodependenciashilt.classes

import android.content.Context
import android.util.Log
import android.widget.Toast

class Carro(
    val motor: Motor,
    val context: Context
    ) {
//class Carro {

    //lateinit var motor: Motor

    fun ligar(){
        motor.acionar()
        //println("Carro ligado")
        Toast.makeText(context, "Carro ligado", Toast.LENGTH_SHORT).show()
        Log.i("teste_hilt", "Carro ligado")
    }
}