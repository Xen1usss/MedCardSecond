package medcard.second.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import medcard.second.R
import medcard.second.ViewModelForFragmentA
import medcard.second.databinding.FragmentBForActivityABinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class FragmentAForActivityA : Fragment() {

    private val viewModel: ViewModelForFragmentA by viewModel()
    lateinit var binding: FragmentBForActivityABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentBForActivityABinding.inflate(inflater, container, false)
       return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }

}