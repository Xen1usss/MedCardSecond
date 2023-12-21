package medcard.second.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import medcard.second.R
import medcard.second.ViewModelForFragmentA
import medcard.second.ViewModelForFragmentB
import medcard.second.databinding.FragmentABinding
import medcard.second.databinding.FragmentBBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FragmentB : BaseFragment<FragmentBBinding, ViewModelForFragmentB>() {

    override val viewModel: ViewModelForFragmentB by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBBinding =
        FragmentBBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentA)
        }
    }
}