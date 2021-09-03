package com.example.first

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter: TextView? = null
    //private var i: Int = 0
    private var i: Int = 123
    private var dounbe = 9.6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        i = savedInstanceState?.getInt("amount") ?: 0

        counter = findViewById(R.id.counter)
        counter?.text = i.toString()
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            onClickTest()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("amount", i)
    }

    private fun onClickTest() {
        i++
        counter?.text = i.toString()
    }

}