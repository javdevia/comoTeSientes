package com.project.comotesientes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.project.comotesientes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var actualEmotion: Emotions = Emotions.triste

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
        initListeners()
    }

    private fun initUi() {
        binding.tvPregunta.text = "¿Te sientes triste?"
    }

    private fun initListeners() {
        //binding.btnYes.setOnClickListener { goToEmotionDetail() }
        binding.btnNo.setOnClickListener {
            actualEmotion.nextEmotion()
            binding.tvPregunta.text = when (actualEmotion) {
                Emotions.triste -> "¿Te sientes triste?"
                Emotions.enojado -> "¿Te sientes enojado?"
                Emotions.asustado -> "¿Estás asustado?"
                Emotions.desagrado -> "¿Sientes asco?"
                Emotions.feliz -> "¿Te encuentras feliz?"
            }
        }
    }
}