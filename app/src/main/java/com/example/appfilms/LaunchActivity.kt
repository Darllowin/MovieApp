package com.example.appfilms

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.appfilms.databinding.AuthLayoutBinding
import com.example.appfilms.databinding.LaunchLayoutBinding

class LaunchActivity : AppCompatActivity() {
    private lateinit var binding: LaunchLayoutBinding
    private var timer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LaunchLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startTimer(2000)
    }
    private fun startTimer(timeMills: Long) {
        timer?.cancel()
        timer = object : CountDownTimer(timeMills, 1000) {
            override fun onTick(timeS: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@LaunchActivity, AuthActivity::class.java)
                startActivity(intent)
            }
        }.start()
    }
}