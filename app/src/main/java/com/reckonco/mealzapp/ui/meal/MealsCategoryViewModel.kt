package com.reckonco.mealzapp.ui.meal

import androidx.lifecycle.ViewModel
import com.reckonco.mealzapp.model.MealsRepository
import com.reckonco.mealzapp.model.response.MealsResponse

class MealsCategoryViewModel(private val repository: MealsRepository = MealsRepository()) : ViewModel() {

    fun getMeals() : List<MealsResponse>{
        return repository.getMeals()?.categories.orEmpty()
    }

}