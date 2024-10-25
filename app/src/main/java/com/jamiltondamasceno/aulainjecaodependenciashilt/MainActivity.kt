package com.jamiltondamasceno.aulainjecaodependenciashilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Banda
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Carro
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Musico
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Carro( motor )
    //@Inject lateinit var carro: Carro//7 vezes em diferentes arquivos
    //@Inject lateinit var musico: Musico
    @Inject lateinit var banda: Banda

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //carro.ligar()
        //musico.tocar()
        banda.tudoSendoTocado()

    }
}