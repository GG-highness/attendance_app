package com.example.attendance_app.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.attendance_app.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    companion object {
        val TAG = SignupActivity::class.simpleName
    }

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener{
            finish()
        }
    }
}
