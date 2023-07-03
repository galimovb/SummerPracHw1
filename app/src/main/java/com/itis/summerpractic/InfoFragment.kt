package com.itis.summerpractic

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.itis.summerpractic.databinding.FragmentInfoBinding

class InfoFragment : Fragment(R.layout.fragment_info) {

    /*private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!
    private var tvName: TextView? = null
    private var tvElem: TextView? = null
    private var city: City? = null
    private var idFromBundle: Int? = null
    private lateinit var ivCover: ImageView
    private var mainInf: String? = null
    private var descInf: String? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentInfoBinding.bind(view)
        tvName = binding.tvName
        tvElem = binding.tvElem
        ivCover = binding.ivCover

        idFromBundle = arguments?.getInt("ID")
        city = CityRepository.getCityById(idFromBundle?: 0)
        if (city != null) {
            mainInf = resources.getString(R.string.id) + ": " + city?.id + ", " +
                    resources.getString(R.string.name) + ": " + city?.name

            tvName?.text = mainInf
            descInf = resources.getString(R.string.about) + ": " + city?.about
            tvElem?.text = descInf
            Glide.with(binding.root)
                .load(city?.url)
                .placeholder(R.drawable.itis)
                .error(R.drawable.error)
                .into(ivCover)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }*/
}