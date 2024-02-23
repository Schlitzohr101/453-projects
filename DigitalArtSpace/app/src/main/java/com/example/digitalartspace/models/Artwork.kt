package com.example.digitalartspace.models

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Artwork (
    @StringRes val nameResId: Int,
    @IntegerRes val yearResId: Int,
    @StringRes val creatorResId: Int,
    @DrawableRes val imageResId: Int,
    @StringRes val descriptionResId: Int,
)