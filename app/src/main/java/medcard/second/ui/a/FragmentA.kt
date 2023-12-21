package medcard.second.ui.a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import medcard.second.R
import medcard.second.databinding.FragmentABinding
import medcard.second.ui.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class FragmentA : BaseFragment<FragmentABinding, ViewModelA>() {

    override val viewModel: ViewModelA by viewModel()

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