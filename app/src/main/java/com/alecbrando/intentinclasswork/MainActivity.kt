package com.alecbrando.intentinclasswork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alecbrando.intentinclasswork.databinding.ActivityMainBinding
import com.alecbrando.intentinclasswork.util.logger

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    override fun onStart() {
        super.onStart()
        logger("onStart")
    }

    override fun onResume() {
        super.onResume()
        logger("onResume")
    }

    override fun onPause() {
        super.onPause()
        logger("onPause")
    }

    override fun onStop() {
        super.onStop()
        logger("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        logger("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        logger("onDestroy")
    }

    private fun initListeners() = with(binding) {
        btnStr.setOnClickListener {
            // CODE HERE
        }
        btnInt.setOnClickListener {
            // CODE HERE
        }
    }
}