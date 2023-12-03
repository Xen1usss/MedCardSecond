package medcard.second.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import medcard.second.R
import medcard.second.databinding.FragmentBForActivityABinding

class FragmentBForActivityA : Fragment() {

    //здесь был онкриейт - почему?

    lateinit var binding: FragmentBForActivityABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBForActivityABinding.inflate(layoutInflater, container, false )
        return binding.root
    }


}