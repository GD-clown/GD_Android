package com.hackathon.project.presentation.ui

import android.content.Intent
import com.hackathon.project.R
import com.hackathon.project.databinding.ActivityMainBinding
import com.hackathon.project.presentation.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun init() {
        onClick()
    }

    private fun onClick() {
        binding.beforeGameResult.setOnClickListener {
            startActivity(Intent(this, FinishGameActivity::class.java))
        }
        binding.goPredictionGame.setOnClickListener {
            startActivity(Intent(this, PredictionGameActivivty::class.java))
        }
    }
}