package com.binitgupta.womensafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_verification.*

class VerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        verify_button.setOnClickListener {
            val intent = Intent(this, OneTimeInfoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
//        super.onBackPressed()
        finish()
    }

}