package com.suetham.desafioadventista

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilita o modo Edge-to-Edge, ocupando toda a tela
        enableEdgeToEdge()

        setContentView(R.layout.activity_login)

        // Configura a remoção da barra de status
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configura o OnClickListener para o link de cadastro
        val signUpLink: TextView = findViewById(R.id.signUpLink)
        signUpLink.setOnClickListener {
            // Cria um Intent para abrir a CadastroActivity
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}
