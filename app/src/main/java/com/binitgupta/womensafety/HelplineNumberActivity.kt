package com.binitgupta.womensafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_helpline_number.*

class HelplineNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helpline_number)

        back_btn.setOnClickListener {
            finish()
        }

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        finish()
    }
}