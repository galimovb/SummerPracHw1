package com.itis.summerpractic

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractic.databinding.FragmentCameraBinding
import com.itis.summerpractic.databinding.FragmentPhoneBinding
import com.itis.summerpractic.databinding.FragmentSettingsBinding

class CameraFragment : Fragment(R.layout.fragment_camera) {
    private var binding: FragmentCameraBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCameraBinding.bind(view)
        binding?.run {
            btnToDefaultCamera.setOnClickListener {
                val className = this@CameraFragment.javaClass.simpleName
                findNavController().navigate(R.id.action_cameraFragment2_to_defaultFragment)
                Snackbar.make(view, "Переход из $className в   default фрагмент", Snackbar.LENGTH_SHORT).show()
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}