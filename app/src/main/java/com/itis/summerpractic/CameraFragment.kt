package com.itis.summerpractic

import androidx.fragment.app.Fragment
import com.itis.summerpractic.databinding.FragmentCameraBinding
import com.itis.summerpractic.databinding.FragmentPhoneBinding

class CameraFragment : Fragment(R.layout.fragment_camera) {
    private var binding: FragmentCameraBinding? = null
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}