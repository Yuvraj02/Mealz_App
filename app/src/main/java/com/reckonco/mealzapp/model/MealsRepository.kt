package com.reckonco.mealzapp.model

import com.reckonco.mealzapp.model.api.MealsWebService
import com.reckonco.mealzapp.model.response.MealsCategoryResponse

class MealsRepository(private val service:MealsWebService = MealsWebService()) {

    fun getMeals() : MealsCategoryResponse?{
      return  service.getMeals().execute().body()
    }
}