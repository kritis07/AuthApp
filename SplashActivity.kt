package com.example.authapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val currentUser = FirebaseAuth.getInstance().currentUser

        if (currentUser != null) {
            // User already logged in
            startActivity(Intent(this, HomeActivity::class.java))
        } else {
            // User not logged in
            startActivity(Intent(this, LoginActivity::class.java))
        }
        finish()
    }
}
