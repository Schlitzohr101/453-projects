package com.example.digitalartspace.data

import com.example.digitalartspace.R
import com.example.digitalartspace.models.Artwork

class Database() {
    fun loadArtwork():List<Artwork> {
        return listOf<Artwork>(
            Artwork(R.string.Artwork1Name,R.integer.Artwork1Year,R.string.Artwork1Creator,R.drawable.art1,R.string.Artwork1Desc),
            Artwork(R.string.Artwork2Name,R.integer.Artwork2Year,R.string.Artwork2Creator,R.drawable.art2,R.string.Artwork2Desc),
            Artwork(R.string.Artwork3Name,R.integer.Artwork3Year,R.string.Artwork3Creator,R.drawable.art3,R.string.Artwork3Desc)
        )
    }
}
