package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity.databinding.ActivitySystemBinding

class system : AppCompatActivity() {

    lateinit var contenedor:ActivitySystemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contenedor= ActivitySystemBinding.inflate(layoutInflater)

        setContentView(contenedor.root)

        val string=intent.getStringExtra("data")
        contenedor.txtTitle.text=string

    }
}