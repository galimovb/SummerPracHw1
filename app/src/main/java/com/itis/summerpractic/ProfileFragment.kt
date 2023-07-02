package com.itis.summerpractic

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractic.databinding.FragmentPhoneBinding
import com.itis.summerpractic.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        binding?.run {
            btnToDefaultProfile.setOnClickListener {
                val className = this@ProfileFragment.javaClass.simpleName
                findNavController().navigate(R.id.action_profileFragment_to_defaultFragment)
                Snackbar.make(view, "Переход из $className в   default фрагмент", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}