package com.itis.summerpractic

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.itis.summerpractic.databinding.ItemCityBinding

class CityItem(
    private val binding : ItemCityBinding
) : ViewHolder(binding.root){

    fun onBind(city : City){
        binding.run {
            tvTittle.text = city.name
            tvDesc.text= city.about


        }
    }
}