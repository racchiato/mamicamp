package com.terserah.mamicamp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_employee_list.*

class EmployeeListActivity: AppCompatActivity() {
    var adapterBebas : EmployeeAdapter ?= null
    var datanya : MutableList<EmployeePojo> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_employee_list)
        adapterBebas = EmployeeAdapter(this, datanya)
        recyclerEmployee.adapter = adapterBebas

        for (i in 0 until 100){
            val age = 10 + i
            val salary = i*55
            datanya.add(EmployeePojo("Nama $i", "Umur $age", "Salary $salary"))
        }

        adapterBebas?.notifyDataSetChanged()

    }
}