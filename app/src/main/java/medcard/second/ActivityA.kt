package medcard.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import medcard.second.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityABinding // почему не сразу присваиваем? //почему ругается на private?

        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater) //я не понимаю, что присвоили тут
        val view = binding.root //типа родительский элемент, но от чего
        setContentView(view) //обязательно ли переносить в отдельную переменную binding.root?

        MAIN = this
    }
}

