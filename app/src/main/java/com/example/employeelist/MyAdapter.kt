package com.example.employeelist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var con: Context, var list: List<UserDetailsItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var viewName= itemView.findViewById<TextView>(R.id.tvName)
        var viewMail = itemView.findViewById<TextView>(R.id.tvMail)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view= LayoutInflater.from(con).inflate(R.layout.row_item,parent,false)
        return ViewHolder(view)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.viewName.text=list[position].name
        holder.viewMail.text=list[position].email.lowercase()


        holder.itemView.setOnClickListener {
            val intent = Intent(con, EmployeeDetails::class.java)

            intent.putExtra("id", item.id)
            intent.putExtra("name", item.name)
            intent.putExtra("email", item.email.lowercase())
            intent.putExtra("phone", item.phone)

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            con.startActivity(intent)


            Toast.makeText(con,"cliked.$position",Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }



}






