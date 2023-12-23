package medcard.second.ui.a

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class ViewModelA(val test:String) : ViewModel() {

    sealed class Event {

        object NavigateToB: Event()

        data class Message(val message: String): Event()

    }

    private val chanel = Channel<Event>()

    val eventFlow = chanel.receiveAsFlow()

    fun log(){

        viewModelScope.launch {
            chanel.send(Event.Message("bbbb"))
        }

    //    println("AAAAAAAAAAA $test")
    }

    fun onButtonClick(){
        viewModelScope.launch {
            chanel.send(Event.NavigateToB)
        }
    }

}