package medcard.second.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import medcard.second.R
import medcard.second.ViewModelForFragmentA
import org.koin.androidx.viewmodel.ext.android.viewModel


class FragmentAForActivityA : Fragment() {

    private val viewModel: ViewModelForFragmentA by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.fragment_for_activity_a, container, false)
    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }

}