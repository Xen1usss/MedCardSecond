package medcard.second

import androidx.lifecycle.ViewModel

class ViewModelForFragmentA(val test:String) : ViewModel() {

    fun log(){
        println("AAAAAAAAAAA $test")
    }

}