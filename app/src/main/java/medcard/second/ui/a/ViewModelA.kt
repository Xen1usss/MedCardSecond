package medcard.second.ui.a

import androidx.lifecycle.ViewModel

class ViewModelA(val test:String) : ViewModel() {

    fun log(){
        println("AAAAAAAAAAA $test")
    }
}