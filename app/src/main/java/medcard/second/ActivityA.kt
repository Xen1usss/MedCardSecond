package medcard.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import medcard.second.fragment.FragmentForActivityA

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }
}