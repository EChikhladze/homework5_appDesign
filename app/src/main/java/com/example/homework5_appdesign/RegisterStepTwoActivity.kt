package com.example.homework5_appdesign

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.homework5_appdesign.databinding.ActivityLogInBinding

class RegisterStepTwoActivity: AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHeader.text = getString(R.string.btn_register)
        binding.btnLogIn.text = getString(R.string.btn_sign_up)
        binding.edEmail.hint = "Username"
        binding.edPassword.visibility = View.GONE
        binding.tvAgreement.text = getString(R.string.sign_up_agreement)

        binding.btnBack.setOnClickListener() {
            val intent = Intent(this, RegisterStepOneActivity::class.java)
            startActivity(intent)
        }
    }
}