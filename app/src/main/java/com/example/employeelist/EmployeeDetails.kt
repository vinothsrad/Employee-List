package com.example.employeelist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.RelativeLayout
import android.widget.TextView


class EmployeeDetails : AppCompatActivity() {
    lateinit var rvMain: RelativeLayout
    var BASE_URL= "https://jsonplaceholder.typicode.com/"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)

         rvMain=findViewById(R.id.R_layout)



        val EmpId=findViewById<TextView>(R.id.tvId)
        val EmpName=findViewById<TextView>(R.id.tvName)
        val EmpEmail=findViewById<TextView>(R.id.tvEmail)

        val EmpPhone=findViewById<TextView>(R.id.tvPhone)

        val bundle:Bundle?=intent.extras
        val userId=bundle!!.getString("id")
        val userName=bundle!!.getString("name")
        val userEmail=bundle!!.getString("email")
        val userPhone=bundle!!.getString("phone")

        EmpId.text=userId
        EmpName.text=userName
        EmpEmail.text=userEmail
        EmpPhone.text=userPhone


    }


}