package medcard.second.di

import medcard.second.ui.a.ViewModelA
import medcard.second.ui.b.ViewModelB
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val myModule = module {

    single { "Test" }

    viewModel{
        ViewModelA(get())
    }

    viewModel{
        ViewModelB()
    }
}