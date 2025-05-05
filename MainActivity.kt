package com.example.myapplication
//package com.example.revenuer.R
//package com.finepointmobile.findViewById
//implementation "android.ui:ui-framework:0.1.0-dev03"
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.view.View.OnClickListener
import android.widget.ImageView
//import android.R



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val img1: ImageView = findViewById(R.id.imageView3)
        val img2: ImageView = findViewById(R.id.imageView)
        val img3: ImageView = findViewById(R.id.imageView4)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        button1.setOnClickListener {
                    img1.setImageResource(R.drawable.izuku2)
            }
        button2.setOnClickListener {
            img2.setImageResource(R.drawable.iruma2)
        }
        button3.setOnClickListener {
            img3.setImageResource(R.drawable.yuji2)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            //content
        //    setContent (Text("Test") )

      //      }

        }
        // fun display () {

       // }
    }

}
