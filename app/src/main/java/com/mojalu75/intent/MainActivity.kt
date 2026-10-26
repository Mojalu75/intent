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
        val intent = Intent(applicationContext, DataActivity::class.java)
        setContentView(R.layout.activity_main)
        binding.button.setOnClickListener {
            var text = binding.textInputLayout.editText?.text.toString()
            intent.putExtra("texto_int", text )
        }

    }
}