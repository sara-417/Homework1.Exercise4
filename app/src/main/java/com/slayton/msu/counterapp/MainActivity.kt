package com.slayton.msu.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = Counter()
    private lateinit var counterButton: Button
    private lateinit var counterTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterButton = findViewById(R.id.add_to_count_btn)
        counterTxt = findViewById(R.id.counter_txt)

        counterButton.setOnClickListener{
            counter.addCount()
            counterTxt.setText(counter.getCount().toString())
        }

    }

}

