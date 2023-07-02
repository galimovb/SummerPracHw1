package com.itis.summerpractic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView //cpisok gorodov
import com.itis.summerpractic.databinding.ItemCityBinding

class CityAdapter(
    private var list : List<City>
) : RecyclerView.Adapter<CityItem>() {

    override fun onCreateViewHolder(//то как создаем ячейку
        parent: ViewGroup,
        viewType: Int
    ): CityItem = CityItem(
            ItemCityBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )



    override fun onBindViewHolder(holder: CityItem, position: Int) { //в новую ячейку записываем данные
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int { //количество ячеек
        return list.size
    }


}