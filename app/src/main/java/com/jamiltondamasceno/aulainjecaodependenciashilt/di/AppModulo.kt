package com.jamiltondamasceno.aulainjecaodependenciashilt.di

import android.content.Context
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Bateria
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Carro
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Instrumento
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Motor
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.MotorEnergiaSolar
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.MotorGasolina
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Musico
import com.jamiltondamasceno.aulainjecaodependenciashilt.classes.Violao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn( SingletonComponent::class )
object AppModulo {

   @Provides
   fun proverMusico( @Named("violao") instrumento: Instrumento ) : Musico {
      return Musico( instrumento )
   }

   @Provides
   @Named("violao")
   fun proverViolao() : Instrumento {
      return Violao()
   }

   @Provides
   @Named("bateria")
   fun proverBateria() : Instrumento {
      return Bateria()
   }

   @Provides
   fun proverCarro( motor: Motor, @ApplicationContext context: Context) : Carro {//Veiculo
      return Carro( motor, context )
   }

   @Provides
   fun proverMotor() : Motor {
      //return MotorGasolina()
      return MotorEnergiaSolar()
   }

}