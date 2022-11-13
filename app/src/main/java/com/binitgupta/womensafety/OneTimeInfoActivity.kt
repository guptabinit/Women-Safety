package com.binitgupta.womensafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one_time_info.*

class OneTimeInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_time_info)

        next_button.setOnClickListener{
            val intent = Intent(this, BodyActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}