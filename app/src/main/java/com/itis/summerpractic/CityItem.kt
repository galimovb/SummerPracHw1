package com.itis.summerpractic

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.itis.summerpractic.City
import com.itis.summerpractic.R
import com.itis.summerpractic.databinding.ItemCityBinding

class CityItem(
    private val binding: ItemCityBinding,
    private val glide: RequestManager,
    private val onItemClick: (City) -> Unit,
) : ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.NONE)

    private val context: Context
        get() = itemView.context

    fun onBind(city: City) {
        binding.run {
            tvTitle.text = city.name
            tvDesc.text = city.about

            glide
                .load(city.url)
                .placeholder(R.drawable.itis)
                .error(R.drawable.error)
                .apply(options)
                .into(ivImage)

            root.setOnClickListener {
                onItemClick(city)
            }
            tvTitle.setTextColor(context.getColor(city.color))
        }
    }

    private val City.color
        get() = if (id > 100) {
            R.color.black
        } else {
            R.color.accent
        }
}
