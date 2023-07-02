package com.itis.summerpractic

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractic.databinding.FragmentPhoneBinding
import com.itis.summerpractic.databinding.FragmentProfileBinding
import com.itis.summerpractic.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private var binding: FragmentSettingsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
        binding?.run {
            btnToDefaultSettings.setOnClickListener {
                val className = this@SettingsFragment.javaClass.simpleName
                findNavController().navigate(R.id.action_settingFragment_to_defaultFragment)
                Snackbar.make(view, "Переход из $className в   default фрагмент", Snackbar.LENGTH_SHORT).show()
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}