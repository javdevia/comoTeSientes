package com.project.comotesientes

sealed class Emotions(val emotionText: String) {
    object feliz : Emotions("feliz")
    object enojado : Emotions("enojado")
    object triste : Emotions("triste")
    object asustado : Emotions("asustado")
    object desagrado : Emotions("desagradado")

    fun nextEmotion(): Emotions {
        return when (this) {
            feliz -> enojado
            enojado -> triste
            triste -> asustado
            asustado -> desagrado
            desagrado -> feliz
        }
    }
}