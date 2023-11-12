package medcard.second.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import medcard.second.R
import medcard.second.ViewModelForFragmentA


class FragmentForActivityA : Fragment() {

    companion object {
        fun newInstance() = FragmentForActivityA()
    }

    private lateinit var viewModel: ViewModelForFragmentA

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_for_activity_a, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            ViewModelForFragmentA::class.java
        )
        // TODO: Use the ViewModel
    }

}