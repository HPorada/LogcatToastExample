package com.example.logcattoastexample

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)
    }

    fun onClickShort(view: View) {
        val etToast: EditText = findViewById(R.id.etToast)
        val message: String = etToast.text.toString()

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


    fun onClickLong(view: View) {
        val etToast: EditText = findViewById(R.id.etToast)
        val message: String = etToast.text.toString()

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }


    fun onClickGravity(view: View) {
        val etToast: EditText = findViewById(R.id.etToast)
        val message: String = etToast.text.toString()

        val myToast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        myToast.setGravity(Gravity.TOP, 150, 300)
        myToast.show()
    }
}