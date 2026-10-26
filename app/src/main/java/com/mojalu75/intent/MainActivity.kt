package com.mojalu75.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mojalu75.intent.databinding.ActivityMainBinding
import kotlin.jvm.java


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.main)
        binding.button.setOnClickListener {
            val text = binding.textInputLayout.editText?.text.toString()
            val intent = Intent(applicationContext, DataActivity::class.java)
            intent.putExtra("texto_int", text )
            startActivity(intent)
        }

    }
}