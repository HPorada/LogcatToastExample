package com.example.logcattoastexample

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)
    }

    fun onClickLog(view: View) {
        val etName: TextView = findViewById(R.id.etName)
        val name: String = etName.text.toString()

        Log.i("INFORMATION", "$name clicked Logcat button.")
    }

    fun onClickToast(view: View) {
        val etName: TextView = findViewById(R.id.etName)
        val name: String = etName.text.toString()

        Toast.makeText(this, "Hello, $name!", Toast.LENGTH_SHORT).show()
    }
}