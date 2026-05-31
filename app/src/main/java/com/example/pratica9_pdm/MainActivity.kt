package com.example.pratica9_pdm

import DestinoAdapter
import DestinoModel
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)

        val listaDestinos = listOf(
            DestinoModel("Paris", "Cidade Luz", "Descrição detalhada de Paris...", R.drawable.paris),
            DestinoModel("Abu Dhabi", "Luxo no Deserto", "Descrição detalhada de Abu Dhabi...", R.drawable.abu_dhabi),
            DestinoModel("Barcelona", "Arte e Arquitetura", "Descrição detalhada de Barcelona...", R.drawable.barcelona),
            DestinoModel("Budapeste", "Pérola do Danúbio", "Descrição detalhada de Budapeste...", R.drawable.budapeste),
            DestinoModel("Colômbia", "Ritmo e Cores", "Descrição detalhada da Colômbia...", R.drawable.colombia),
            DestinoModel("Índia", "Espiritualidade e Cultura", "Descrição detalhada da Índia...", R.drawable.india),
            DestinoModel("Rio de Janeiro", "Cidade Maravilhosa", "Descrição detalhada do Rio de Janeiro...", R.drawable.rio_de_janeiro),
            DestinoModel("Tailândia", "Paraíso Tropical", "Descrição detalhada da Tailândia...", R.drawable.tailandia),
            DestinoModel("Tóquio", "Metrópole Tecnológica", "Descrição detalhada de Tóquio...", R.drawable.tokyo),
            DestinoModel("Turquia", "O Encontro de Continentes", "Descrição detalhada da Turquia...", R.drawable.turquia)
        )

        rv.adapter = DestinoAdapter(listaDestinos) { destino ->
            val intent = Intent(this, DetalheActivity::class.java).apply {
                putExtra("NOME", destino.nome)
                putExtra("DESCRICAO", destino.descricaoDetalhada)
                putExtra("IMAGEM", destino.imagemResId)
            }
            startActivity(intent)
        }
    }
}