package medcard.second.ui.b

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import medcard.second.R
import medcard.second.databinding.FragmentBBinding
import medcard.second.ui.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class FragmentB : BaseFragment<FragmentBBinding, ViewModelB>() {

    override val viewModel: ViewModelB by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBBinding =
        FragmentBBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentA)
        }
    }
}