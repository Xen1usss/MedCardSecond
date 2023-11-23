package medcard.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }
}

<fragment
android:name="medcard.second.fragment.FragmentAForActivityA"
android:id="@+id/placeForFragments"
android:layout_width="match_parent"
android:layout_height="match_parent" />