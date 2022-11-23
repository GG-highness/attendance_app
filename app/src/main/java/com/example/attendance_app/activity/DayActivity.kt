package com.example.attendance_app.activity

import android.os.Bundle
import android.os.Handler
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.attendance_app.databinding.ActivityDayBinding
import com.example.attendance_app.viewmodel.DayViewModel
import java.util.*
import kotlin.concurrent.timer

class DayActivity : AppCompatActivity() {
    companion object {
        val TAG = DayActivity::class.simpleName
    }

    private lateinit var binding: ActivityDayBinding
    private val viewModel by viewModels<DayViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler = Handler()
        timer(name = "testTimer", period = 1000) {
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val second = calendar.get(Calendar.SECOND)
            handler.post {
                binding.currentTime.text = "${hour}時 ${minute}分 ${second}秒"
            }
        }
    }
}
