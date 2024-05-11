package com.example.loginscreenapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var edit_username : TextView;
    lateinit var edit_password : TextView;
    lateinit var btn_login : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edit_username= findViewById(R.id.edit_username);
        edit_password = findViewById(R.id.edit_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener {
            val username = edit_username.text.toString();
            val password = edit_password.text.toString();

            Toast.makeText(applicationContext, "Username: $username\nPassword: $password", Toast.LENGTH_SHORT).show()
        }
    }
}