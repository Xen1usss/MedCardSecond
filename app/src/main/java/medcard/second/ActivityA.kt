package medcard.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        MAIN = this
    }
}

