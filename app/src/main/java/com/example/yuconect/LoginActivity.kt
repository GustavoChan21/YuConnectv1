package com.example.yuconect

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Cambio del ACTION BAR STATUS
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAGS_CHANGED)
            window.statusBarColor = ContextCompat.getColor(this, R.color.ColorStatusLogin)
        }

        val forgetPasswordLogin: TextView = findViewById((R.id.forget_Password))
        forgetPasswordLogin.setOnClickListener{
            Toast.makeText(this@LoginActivity, "Olvidé mi Contraseña", Toast.LENGTH_SHORT).show()
        }

        val bottom: AppCompatButton = findViewById(R.id.aceptar)
        bottom.setOnClickListener {
            startActivity(Intent(this, ActivityResult::class.java))
            startActivity(parentActivityIntent)
            finish()
        }

        val bottom2: AppCompatButton = findViewById(R.id.crear)
        bottom2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            startActivity(parentActivityIntent)
            finish()

        }
    }
}