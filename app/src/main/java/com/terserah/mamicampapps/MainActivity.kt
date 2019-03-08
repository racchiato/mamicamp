package com.terserah.mamicampapps

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextView1.text = "Nama"
        TextView2.text = "Kelas"
        TextView3.text = "Hobi"
        TextView4.text = "Gender"

        Button1.text = "Submit"
        Button1.setOnClickListener {
            Toast.makeText(MainActivity@this, TextView1.text.toString(), Toast.LENGTH_SHORT).show()
            TextView4.text = "Laki"
        }

    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }
}
