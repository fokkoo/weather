package com.example.weather

import java.util.ArrayList

object Repository {
    var weatherList: List<Weather> = listOf(
        Weather(),
        Weather("moscow", 15),
        Weather("piter", 12),
        Weather("omsk", 17),
        Weather(temperature = 17)

    ) // объект с большой буквы, метод с маленькой буквы
}


/*
 class Repository private constructor() {

     private val weatherList: MutableList<Weather>
     fun getWeatherList():List<Weather>{

         return  weatherList
     }

   companion object{
       var repository : Repository? = null
       val instance: Repository?
       get(){
           if (repository== null){
               repository = Repository()
           }
           return repository
       }
   }

     init {
         weatherList = ArrayList()
         weatherList.add(Weather("Moscow",12))
         weatherList.add(Weather("Piter"))
         weatherList.add(Weather("Omsk",16))
     }
}


 */