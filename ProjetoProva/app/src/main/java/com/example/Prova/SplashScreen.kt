package com.example.Prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.Prova.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        mudarParaActivity()
    }

    private fun mudarParaActivity() {
        val intent = Intent(this, MainActivity::class.java)

        Handler().postDelayed({
            intent.change()
        }, 4000)
    }

    fun Intent.change() {
        startActivity(this)
        finish()
    }

}