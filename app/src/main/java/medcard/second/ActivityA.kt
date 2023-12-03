package medcard.second

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import medcard.second.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityABinding // почему не сразу присваиваем? //почему ругается на private?
        lateinit var navController: NavController

        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater) //я не понимаю, что присвоили тут
        val view = binding.root //типа родительский элемент, но от чего
        setContentView(view) //обязательно ли переносить в отдельную переменную binding.root?
        navController = Navigation.findNavController(this, R.id.navigation_host_container_for_fragments)

        MAIN = this
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        val binding
        binding.button_next
    }

}

