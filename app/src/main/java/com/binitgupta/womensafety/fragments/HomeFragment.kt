package com.binitgupta.womensafety.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.binitgupta.womensafety.BodyActivity
import com.binitgupta.womensafety.HelplineNumberActivity
import com.binitgupta.womensafety.R
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
            activity?.finish()
        }

        helpline_call_btn.setOnClickListener{
            val intent = Intent(activity, HelplineNumberActivity::class.java)
            activity?.startActivity(intent)
            activity?.finish()
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