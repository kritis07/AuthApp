package com.example.authapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import android.widget.TextView



class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val loginBtn = findViewById<Button>(R.id.btnLogin)

        loginBtn.setOnClickListener {

            val emailText = email.text.toString().trim()
            val passText = password.text.toString().trim()

            if (emailText.isEmpty()) {
                email.error = "Email required"
                return@setOnClickListener
            }

            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
                email.error = "Enter valid email"
                return@setOnClickListener
            }

            if (passText.length < 6) {
                password.error = "Password must be at least 6 characters"
                return@setOnClickListener
            }

            loginBtn.isEnabled = false
            loginBtn.text = "Logging in..."

            auth.signInWithEmailAndPassword(emailText, passText)
                .addOnSuccessListener {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                }
                .addOnFailureListener {
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                    loginBtn.isEnabled = true
                    loginBtn.text = "LOGIN"
                }
        }

        val signupText = findViewById<TextView>(R.id.tvSignup)

        signupText.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }

        val forgotPassword = findViewById<TextView>(R.id.tvForgotPassword)

        forgotPassword.setOnClickListener {
            val emailText = email.text.toString().trim()

            if (emailText.isEmpty()) {
                Toast.makeText(this, "Enter your email first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            auth.sendPasswordResetEmail(emailText)
                .addOnSuccessListener {
                    Toast.makeText(
                        this,
                        "Password reset email sent",
                        Toast.LENGTH_LONG
                    ).show()
                }
                .addOnFailureListener {
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
        }

        val otpLogin = findViewById<TextView>(R.id.tvOtpLogin)

        otpLogin.setOnClickListener {
            startActivity(Intent(this, OtpLoginActivity::class.java))
        }



    }
}
