package com.example.logcattoastexample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLog(view: View) {
        startActivity(Intent(this, LogActivity::class.java))
    }

    fun onClickToast(view: View) {
        startActivity(Intent(this, ToastActivity::class.java))
    }

    fun onClickTask(view: View) {
        //startActivity(Intent(this, TaskActivity::class.java))

    }

}