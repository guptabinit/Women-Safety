package com.binitgupta.womensafety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binitgupta.womensafety.models.SavedContactModel
import com.binitgupta.womensafety.R
import com.binitgupta.womensafety.adapter.SavedContactAdapter

class ContactFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMembers = listOf<SavedContactModel>(
            SavedContactModel("Binit", "House No 122, Dwarka Mor, Near Metro Station, New Delhi - 110023 ", 8982388323),
            SavedContactModel("Durgesh", "House No 148, Uttam Nagar West, New Delhi - 110076", 9373700430),
            SavedContactModel("Shashi", "House No 1233/B, Subhash Nagar, New Delhi - 110043",899399900),
            SavedContactModel("Ashish", "House No 990/A, AyaNagar, Arjangarh, New Delhi - 110047",8002323090),
        )

        val adapter = SavedContactAdapter(listMembers)

        val recycler = requireView().findViewById<RecyclerView>(R.id.recycler_saved_contacts)
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = ContactFragment()
    }
}