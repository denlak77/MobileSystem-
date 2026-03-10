package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * [Affirmation] — это класс данных, который представляет
 * одну карточку аффирмации с текстом и изображением.
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
