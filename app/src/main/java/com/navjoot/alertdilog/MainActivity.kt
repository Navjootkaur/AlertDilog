package com.navjoot.alertdilog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var btnAlert: Button?= null
    var etColor: EditText?=null
    var tvColor: TextView?=null
    var number =1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etColor =findViewById(R.id.etcolor)
        tvColor =findViewById(R.id.tvcolor)
        btnAlert = findViewById(R.id.btnAlert)

        btnAlert?.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("This is title")
                .setMessage("This is message")
                .setCancelable(false)//click on screen restricted
                .setPositiveButton("Yes") { _, _ ->
                    number=number+1
                    etColor?.setText(number.toString())

                    Toast.makeText(this, "Positive button click", Toast.LENGTH_SHORT)
                            .show()
                }
                .setNegativeButton("No") { _, _ ->
                    number=number-1
                    etColor?.setText(number.toString())
                    Toast.makeText(this,"Negative button Click",Toast.LENGTH_SHORT)
                        .show()
                }
                .setNeutralButton("Set 0") { _, _ ->
                    number=0
                    etColor?.setText(number.toString())
                  Toast.makeText(this,"Neutral button click",Toast.LENGTH_SHORT)
                      .show()
                }
                .show()
        }

    }
}