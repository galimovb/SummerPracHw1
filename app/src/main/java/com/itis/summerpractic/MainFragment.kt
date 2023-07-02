package com.itis.summerpractic

import com.itis.summerpractic.databinding.FragmentMainBinding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractic.databinding.FragmentSettingsBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding?.run {
            btnToDeafaultMain.setOnClickListener {
                val className = this@MainFragment.javaClass.simpleName
                findNavController().navigate(R.id.action_mainFragment_to_defaultFragment)
                Snackbar.make(view, "Переход из $className в   default фрагмент", Snackbar.LENGTH_SHORT).show()
            }

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
