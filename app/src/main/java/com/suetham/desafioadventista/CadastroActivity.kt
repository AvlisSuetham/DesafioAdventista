package com.suetham.desafioadventista

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilita o modo Edge-to-Edge, ocupando toda a tela
        enableEdgeToEdge()

        setContentView(R.layout.activity_cadastro) // Certifique-se de ter um layout activity_cadastro.xml

        // Configura a remoção da barra de status
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configura o OnClickListener para o link de login
        val loginLink: TextView = findViewById(R.id.loginLink)
        loginLink.setOnClickListener {
            // Cria um Intent para abrir a LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
