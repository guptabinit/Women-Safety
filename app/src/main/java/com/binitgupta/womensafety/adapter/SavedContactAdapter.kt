package com.binitgupta.womensafety.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.binitgupta.womensafety.models.SavedContactModel
import com.binitgupta.womensafety.R

class SavedContactAdapter(private val listMembers: List<SavedContactModel>) : RecyclerView.Adapter<SavedContactAdapter.ViewHolder>() {


    class ViewHolder(private val item: View): RecyclerView.ViewHolder(item) {
        val imageUser: ImageView = item.findViewById<ImageView>(R.id.img_user)
        val name: TextView = item.findViewById<TextView>(R.id.tvName)
        val address: TextView = item.findViewById<TextView>(R.id.tvAddress)
        val phoneNumber: TextView = item.findViewById<TextView>(R.id.tvPhoneNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.item_saved_contact, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listMembers[position]
        holder.name.text = item.name
        holder.address.text = item.address
        holder.phoneNumber.text = "+91-${item.phoneNumber}"
    }

    override fun getItemCount(): Int {
        return listMembers.size
    }
}