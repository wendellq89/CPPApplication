package com.globalsources.cppapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.globalsources.cppapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI2()
    }

    /**
     * A native method that is implemented by the 'cppapplication' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun stringFromJNI2(): String

    companion object {
        // Used to load the 'cppapplication' library on application startup.
        init {
            System.loadLibrary("cppapplication")
        }
    }
}