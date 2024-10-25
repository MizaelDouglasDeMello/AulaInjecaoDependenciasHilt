package com.jamiltondamasceno.aulainjecaodependenciashilt.di

import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Banda
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Instrumento
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Musico
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

/*

Cobrança -> ModuloCObranca
Venda -> ModuloVendas

* */

@Module
@InstallIn( ActivityComponent::class )
object AppModuloInstrumento {

    @Provides
    fun proverBanda(
        @Named("violao") violao: Instrumento,
        @Named("bateria") bateria: Instrumento
    ) : Banda {
        return Banda(violao, bateria)
    }

}