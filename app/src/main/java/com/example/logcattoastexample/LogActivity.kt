package com.example.logcattoastexample

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
    }

    fun onClickVerbose(view: View) {
        val textView: TextView = findViewById(R.id.tvText)

        Log.v("VERBOSE", "Button VERBOSE was clicked.")

        textView.text = "Button VERBOSE was clicked, verbose Log was added."
    }

    fun onClickDebug(view: View) {
        val textView: TextView = findViewById(R.id.tvText)

        Log.d("DEBUG", "Button DEBUG was clicked.")

        textView.text = "Button DEBUG was clicked, debug Log was added."
    }

    fun onClickInfo(view: View) {
        val textView: TextView = findViewById(R.id.tvText)

        Log.i("INFORMATION", "Button INFORMATION was clicked.")

        textView.text = "Button INFORMATION was clicked, information Log was added."
    }

    fun onClickWarning(view: View) {
        val textView: TextView = findViewById(R.id.tvText)

        Log.w("WARNING", "Button WARNING was clicked.")

        textView.text = "Button WARNING was clicked, warning Log was added."
    }

    fun onClickError(view: View) {
        val textView: TextView = findViewById(R.id.tvText)

        Log.e("ERROR", "Button ERROR was clicked.")

        textView.text = "Button ERROR was clicked, error Log was added."
    }
}