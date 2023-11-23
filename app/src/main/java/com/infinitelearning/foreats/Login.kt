package com.infinitelearning.foreats

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.infinitelearning.foreats.R
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLoginListener(btnLogin)
    }

    private fun btnLoginListener(btnLogin: Button) {
        btnLogin.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}

