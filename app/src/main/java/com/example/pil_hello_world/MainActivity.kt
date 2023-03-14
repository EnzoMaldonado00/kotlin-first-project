package com.example.pil_hello_world // ktlint-disable package-name

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pil_hello_world.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.appTitle.text = getString(R.string.title)
        binding.btnShowText.setOnClickListener() {
            Toast.makeText(applicationContext, binding.editText.text, Toast.LENGTH_SHORT).show()
        }
    }
}
