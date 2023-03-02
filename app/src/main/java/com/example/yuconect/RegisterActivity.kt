package com.example.yuconect

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Cambio del ACTION BAR STATUS
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAGS_CHANGED)
            window.statusBarColor = ContextCompat.getColor(this, R.color.ColorStatusLogin)
        }

        val bottom: AppCompatButton = findViewById(R.id.conect)
        bottom.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            startActivity(parentActivityIntent)
            finish()
        }

        val bottom2: AppCompatButton = findViewById(R.id.regresarLog)
        bottom2.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            startActivity(parentActivityIntent)
            finish()
        }
    }
}