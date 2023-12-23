package medcard.second.ui.a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.launch
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
            viewModel.onButtonClick()
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.eventFlow.collect{
                    when(it){
                        is ViewModelA.Event.Message -> {
                            Snackbar.make(requireView(), it.message, Snackbar.LENGTH_SHORT).show()
                        }
                        ViewModelA.Event.NavigateToB -> {
                            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
                        }
                    }
                }
            }
        }
    }
}