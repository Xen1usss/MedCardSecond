package medcard.second.di

import medcard.second.ViewModelForFragmentA
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val myModule = module {

    single { "Test" }

    viewModel{
        ViewModelForFragmentA(get())
    }
}