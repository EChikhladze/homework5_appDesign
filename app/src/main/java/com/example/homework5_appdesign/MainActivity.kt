package com.example.homework5_appdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework5_appdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogIn.setOnClickListener() {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener() {
            val intent = Intent(this, RegisterStepOneActivity::class.java)
            startActivity(intent)
        }
    }
}