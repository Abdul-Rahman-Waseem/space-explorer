package com.example.spaceex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cl = arrayOf(R.id.constraintLayout1,R.id.constraintLayout2,R.id.constraintLayout3,R.id.constraintLayout4,R.id.constraintLayout5,R.id.constraintLayout6,R.id.constraintLayout7_root,R.id.constraintLayout8_root)
        val left = findViewById<ImageView>(R.id.imageView11)
        val right = findViewById<ImageView>(R.id.imageView4)


        var i = 0

        right.setOnClickListener() {
            val ccl = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(cl[(8+i)%8])
            i++
            val ncl = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(cl[(8+i)%8])
            ccl.alpha = 0f
            ncl.alpha = 1f
        }

        left.setOnClickListener() {
            val ccl = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(cl[(8+i)%8])
            i--
            if (i < 0) -i else i
            val ncl = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(cl[(8+i)%8])
            ccl.alpha = 0f
            ncl.alpha = 1f
        }

        val b = findViewById<ImageView>(R.id.button8)

        b.setOnClickListener() {
            when ((8+i)%8)
            {
                0 -> callmer()
                1 -> callven()
                2 -> callear()
                3 -> callmar()
                4 -> calljup()
                5 -> callsat()
                6 -> callura()
                7 -> callnep()
            }
        }


    }


    fun callmer ()
    {

            val intent = Intent(this,mercury::class.java)
            startActivity(intent)

    }
    fun callven ()
    {
            val intent = Intent(this,venus::class.java)
            startActivity(intent)
    }
    fun callear ()
    {
            val intent = Intent(this,Earth::class.java)
            startActivity(intent)
    }
    fun callmar ()
    {
            val intent = Intent(this,mars::class.java)
            startActivity(intent)
    }
    fun calljup ()
    {
            val intent = Intent(this,jupiter::class.java)
            startActivity(intent)
    }
    fun callsat ()
    {
            val intent = Intent(this,Saturn::class.java)
            startActivity(intent)
    }
    fun callura ()
    {
            val intent = Intent(this,uranus::class.java)
            startActivity(intent)
    }
    fun callnep ()
    {
            val intent = Intent(this,neptune::class.java)
            startActivity(intent)
    }
}