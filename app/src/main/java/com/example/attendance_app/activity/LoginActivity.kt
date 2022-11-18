package com.example.attendance_app.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.attendance_app.databinding.ActivityLoginBinding
import com.example.attendance_app.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    companion object {
        val TAG = LoginActivity::class.simpleName
    }

    private lateinit var binding: ActivityLoginBinding
    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}