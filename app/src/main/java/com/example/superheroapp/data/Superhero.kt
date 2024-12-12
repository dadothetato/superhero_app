package com.example.superheroapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Superhero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
