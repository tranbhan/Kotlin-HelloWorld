package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    private val greeting_array : Array<String> = resources.getStringArray(R.array.greeting_array)
    private val message_array : Array<String> = resources.getStringArray(R.array.message_array)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainBinding.greetingText.text = greeting_array[Random.nextInt(0, greeting_array.size)] + " Stranger"
        mainBinding.contentText.text = message_array[Random.nextInt(0,message_array.size)]
        setContentView(mainBinding.root)
        mainBinding.sendButton.setOnClickListener {

        }
    }

    fun validateInput() {

    }

    fun sendEmail() {

    }
}