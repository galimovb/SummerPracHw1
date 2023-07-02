package com.itis.summerpractic
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractic.R
import com.itis.summerpractic.databinding.FragmentPhoneBinding

class PhoneFragment : Fragment(R.layout.fragment_phone) {
    private var binding: FragmentPhoneBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPhoneBinding.bind(view)
        binding?.run {
            btnToDefault.setOnClickListener {
                val className = this@PhoneFragment.javaClass.simpleName
                findNavController().navigate(R.id.action_phoneFragment_to_defaultFragment)
                Snackbar.make(view, "Переход из $className в   default фрагмент", Snackbar.LENGTH_SHORT).show()
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
