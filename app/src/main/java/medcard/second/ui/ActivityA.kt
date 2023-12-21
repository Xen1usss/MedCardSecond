package medcard.second.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import medcard.second.R
import medcard.second.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    private lateinit var binding: ActivityABinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = Navigation.findNavController(this,
            R.id.navigation_host_container_for_fragments
        )
    }
}