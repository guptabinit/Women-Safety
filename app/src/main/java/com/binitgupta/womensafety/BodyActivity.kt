package com.binitgupta.womensafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.binitgupta.womensafety.fragments.ContactFragment
import com.binitgupta.womensafety.fragments.HomeFragment
import com.binitgupta.womensafety.fragments.MapFragment
import com.binitgupta.womensafety.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_body.*
import kotlinx.android.synthetic.main.fragment_home.*

class BodyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body)

        inflateFragment(HomeFragment.newInstance())
        bottom_bar.selectedItemId = R.id.nav_home

        bottom_bar.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.nav_home -> inflateFragment(HomeFragment.newInstance())
                R.id.nav_maps -> inflateFragment(MapFragment.newInstance())
                R.id.nav_contacts -> inflateFragment(ContactFragment.newInstance())
                R.id.nav_profile -> inflateFragment(ProfileFragment.newInstance())
            }
            true
        }
    }

    private fun inflateFragment(newInstance: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()
    }
}