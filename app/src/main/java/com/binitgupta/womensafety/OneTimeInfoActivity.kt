package com.binitgupta.womensafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_one_time_info.*

class OneTimeInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_time_info)

        val genders = resources.getStringArray(R.array.gender)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, genders)
        genderTextView.setAdapter(arrayAdapter)

        next_button.setOnClickListener{
            val intent = Intent(this, BodyActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}