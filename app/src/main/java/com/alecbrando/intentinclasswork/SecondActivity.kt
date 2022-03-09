package com.alecbrando.intentinclasswork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alecbrando.intentinclasswork.databinding.ActivitySecondBinding
import com.alecbrando.intentinclasswork.util.logger

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private val tvStringDisplay get() = binding.tvDisplayString
    private val tvIntDisplay get() = binding.tvDisplayInt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // TODO: Retrieve the data and load into display
    }

    private fun displayInt(myInt: Int) {
        tvIntDisplay.text = "I thought this is supposed to be a Int"
    }

    private fun displayString(myString: String) {

    }
}