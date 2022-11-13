package com.binitgupta.womensafety.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.binitgupta.womensafety.BodyActivity
import com.binitgupta.womensafety.HelplineNumberActivity
import com.binitgupta.womensafety.R
import kotlinx.android.synthetic.main.activity_helpline_number.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        helpline_btn.setOnClickListener{
            val intent = Intent(activity, HelplineNumberActivity::class.java)
            activity?.startActivity(intent)
        }

        helpline_call_btn.setOnClickListener{
            val intent = Intent(activity, HelplineNumberActivity::class.java)
            activity?.startActivity(intent)
        }

        call_police_fab.setOnClickListener {
            val mNum = 100
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel://$mNum")
            activity?.startActivity(i)
        }

        useful_link_btn.setOnClickListener {
            val address = "advocatechenoyceil.com/2018/01/06/women-safety-india-useful-links-numbers/"
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$address")
            activity?.startActivity(i)
        }

        report_police_btn.setOnClickListener {
            val address = "emailus.delhipolice.gov.in/DCPEmailid.aspx"
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$address")
            activity?.startActivity(i)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}