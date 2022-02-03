package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var contentViews:ActivityMainBinding
    lateinit var button:Button
    lateinit var textBox:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contentViews= ActivityMainBinding.inflate(layoutInflater)

        setContentView(contentViews.root)

        button=contentViews.btnEntrar
        textBox=contentViews.etxtName

        /*button.setOnClickListener { v->
            Toast.makeText(this,textBox.text.toString(),Toast.LENGTH_SHORT).show()
        }*/

    }

    fun clickBoton(v: View){
        Toast.makeText(this,"Click desde la UI de la Activity",Toast.LENGTH_SHORT).show()
    }

    fun saludar(x:View){
        Toast.makeText(this,"Jugando con los Listener en Android Studio y Kotlin",Toast.LENGTH_SHORT).show()
    }

    fun lanzarActivity(view:View){

        if(textBox.text.isEmpty())
        {
            Toast.makeText(this,"Debe llenar el campo de Texto",Toast.LENGTH_SHORT).show()
            textBox.requestFocus()
        }else{
            val intencion = Intent(this,system::class.java)
            intencion.putExtra("data",textBox.text.toString())
            startActivity(intencion)
        }

    }

    fun callOtherActivity(view:View){
        val intencion: Intent =Intent(this,MainActivity2::class.java)
        startActivity(intencion)
    }

    override fun onStart() {
        super.onStart()
        Log.i("result","Iniciando App...")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("result","Reiniciando App...")
    }


    override fun onResume() {
        super.onResume()
        Log.i("result","Resumiendo datos para lanzar la App...")
    }


    override fun onStop() {
        super.onStop()
        Log.i("result","Aplicación detenida")
    }

    override fun onPause() {
        super.onPause()
        Log.i("result","Aplicación Pausada")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("result","Aplicación Cerrada/Destruida")
    }

}

