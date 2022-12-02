package com.hackathon.project.presentation.ui

import androidx.recyclerview.widget.LinearLayoutManager
import com.hackathon.project.R
import com.hackathon.project.databinding.ActivityFinishGameBinding
import com.hackathon.project.presentation.adapter.RecyclerAdapter
import com.hackathon.project.presentation.adapter.RecyclerDTO
import com.hackathon.project.presentation.base.BaseActivity

class FinishGameActivity : BaseActivity<ActivityFinishGameBinding>(R.layout.activity_finish_game) {
    private val adapter = RecyclerAdapter()
    private val data = mutableListOf(
        RecyclerDTO(R.drawable.korea, R.drawable.portugal),
        RecyclerDTO(R.drawable.korea, R.drawable.portugal),
        RecyclerDTO(R.drawable.korea, R.drawable.portugal),
        RecyclerDTO(R.drawable.korea, R.drawable.portugal),
        RecyclerDTO(R.drawable.korea, R.drawable.portugal)
    )

    override fun init() {
        initRecycler()
    }

    private fun initRecycler() {
        binding.recycler.adapter = adapter
        with(binding.recycler) {
            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )
            setHasFixedSize(true)
        }
        adapter.submitList(data)
    }
}