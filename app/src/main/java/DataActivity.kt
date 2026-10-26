package com.mojalu75.intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mojalu75.intent.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val intent = intent

        binding.textView.text = intent.getStringExtra("texto_int")

    }
}