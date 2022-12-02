package com.hackathon.project.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.hackathon.project.databinding.ListItemBinding

class RecyclerAdapter :
    ListAdapter<RecyclerDTO, RecyclerAdapter.ViewHolder>(diffCallBack) {
    class ViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: RecyclerDTO) {
            binding.countryOne.load(data.countryOne)
            binding.countryTwo.load(data.countryTwo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val diffCallBack = object : DiffUtil.ItemCallback<RecyclerDTO>() {
            override fun areItemsTheSame(
                oldItem: RecyclerDTO,
                newItem: RecyclerDTO
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: RecyclerDTO,
                newItem: RecyclerDTO
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}