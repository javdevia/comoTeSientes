package com.project.comotesientes

sealed class Emotions() {
    object feliz : Emotions()
    object enojado : Emotions()
    object triste : Emotions()
    object asustado : Emotions()
    object desagrado : Emotions()

    fun nextEmotion() {
        when (this) {
            feliz -> enojado
            enojado -> triste
            triste -> asustado
            asustado -> desagrado
            desagrado -> feliz
        }
    }
}