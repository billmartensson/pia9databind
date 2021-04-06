package se.magictechnology.pia9databind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import se.magictechnology.pia9databind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var counting = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.fancytext = "Banan!"

        binding.fancycounter = counting

        findViewById<Button>(R.id.thebutton).setOnClickListener {
            binding.fancytext = "Apelsin!"

            counting = counting + 1

            binding.fancycounter = counting

        }

    }


}