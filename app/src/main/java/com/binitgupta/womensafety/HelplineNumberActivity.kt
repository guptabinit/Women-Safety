package com.binitgupta.womensafety

import android.content.Intent
import android.net.Uri
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

        police_call.setOnClickListener {
            val mNum = 100
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }
        ambulance_call.setOnClickListener {
            val mNum = 102
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }
        fire_call.setOnClickListener {
            val mNum = 101
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }
        women_helpline_call.setOnClickListener {
            val mNum = 1091
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }
        women_helpline_domestic_call.setOnClickListener {
            val mNum = 181
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }
        disaster_call.setOnClickListener {
            val mNum = 1077
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }
        child_call.setOnClickListener {
            val mNum = 1098
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }
        missing_call.setOnClickListener {
            val mNum = 1094
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            startActivity(i)
        }


    }

    override fun onBackPressed() {
//        super.onBackPressed()
        finish()
    }
}