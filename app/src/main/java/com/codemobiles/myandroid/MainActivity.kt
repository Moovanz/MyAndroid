package com.codemobiles.myandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codemobiles.myandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEventWidget()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private fun setupEventWidget() {
        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            Toast.makeText(applicationContext, "$username,$password", Toast.LENGTH_SHORT).show()
        }
    }
}

//life cycle



// Build number(about,system) QSR1.190920.001
// Developer option (about > advance, system > advance)
// Enable usb debugging mode