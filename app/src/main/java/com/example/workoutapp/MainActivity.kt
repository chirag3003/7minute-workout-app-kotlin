package com.example.workoutapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //  The binding is name just like the name of the layout with Binding attached
    //Todo 1:We create a variable for it and assign to null
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Todo 2: We inflate the late file by calling inflate on the Binding name
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Todo 3: Then replace the setContentView parameter with binding?.root
        setContentView(binding.root)

        binding.flStart.setOnClickListener {
            val intent = Intent(this@MainActivity,ExerciseActivity::class.java)
            startActivity(intent)
        }
    }

}