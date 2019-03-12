package com.terserah.mamicamp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_main_activity_constraint.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_activity_constraint)
        Log.e("onCreate","onCreate")


    }

    override fun onStart() {
        Log.e("onStart","onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.e("onPause","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("onStop","onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.e("onResume","onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.e("onRestart","onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("onDestroy","onDestroy")
        super.onDestroy()
    }
}
