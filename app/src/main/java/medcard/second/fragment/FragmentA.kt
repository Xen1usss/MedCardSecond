package medcard.second.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import medcard.second.R
import medcard.second.ViewModelForFragmentA
import medcard.second.databinding.FragmentABinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class FragmentA : BaseFragment<FragmentABinding>() {

    private val viewModel: ViewModelForFragmentA by viewModel()
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentABinding =
        FragmentABinding::inflate

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }
    }
}