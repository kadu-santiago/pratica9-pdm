package com.example.pratica9_pdm

import PontoTuristicoAdapter
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val nome = intent.getStringExtra("NOME")
        val desc = intent.getStringExtra("DESCRICAO")
        val imgRes = intent.getIntExtra("IMAGEM", 0)

        val pontosTuristicos =
            listOf("Ponto de Interesse 1", "Ponto de Interesse 2", "Ponto de Interesse 3")

        findViewById<TextView>(R.id.txtNomeDetalhe).text = nome
        findViewById<TextView>(R.id.txtDescricaoDetalhada).text = desc
        findViewById<ImageView>(R.id.imgDetalhe).setImageResource(imgRes)

        val rv = findViewById<RecyclerView>(R.id.rvPontosTuristicos)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = PontoTuristicoAdapter(pontosTuristicos)
    }
}
