package medcard.second.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import medcard.second.ViewModelForFragmentA
import medcard.second.databinding.FragmentABinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class FragmentA : Fragment() {

    private val viewModel: ViewModelForFragmentA by viewModel()
    private var binding: FragmentABinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}