package ru.training.eggtimernotifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.training.eggtimernotifications.databinding.ActivityMainBinding
import ru.training.eggtimernotifications.ui.EggTimerFragment

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

/*
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, EggTimerFragment.newInstance())
                .commitNow()
        }
*/

    }

}