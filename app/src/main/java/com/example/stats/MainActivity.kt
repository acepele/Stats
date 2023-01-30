package com.example.stats

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   // lateinit var imageView: ImageView
    lateinit var name: TextView
   // lateinit var phone: TextView
    lateinit var info: TextView
    lateinit var button: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    var imageView = findViewById<ImageView>(R.id.imageView)
    //    var name = findViewById<TextView>(R.id.name)
    //    var phone = findViewById<TextView>(R.id.phone)
         info = findViewById(R.id.Info)
         button = findViewById(R.id.button)


        button.setOnClickListener{
            info.setText("Nothing else to show!")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("saved_text", info.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        info.setText(savedInstanceState.getString("saved_text"))
    }
}
