package com.reckonco.mealzapp.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoryResponse(val categories: List<MealsResponse>)

data class MealsResponse(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryThumb") val desc: String,
    @SerializedName("strCategoryDescription") val imageUrl: String
)