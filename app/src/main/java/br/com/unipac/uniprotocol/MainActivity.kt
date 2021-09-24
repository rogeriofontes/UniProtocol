package br.com.unipac.uniprotocol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.unipac.uniprotocol.model.domain.Aluno
import br.com.unipac.uniprotocol.model.domain.AlunoRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var alunoRepository = AlunoRepository(this)

        val nomeEdt = findViewById<EditText>(R.id.nomeEdt)
        val matriculaEdt = findViewById<EditText>(R.id.matriculaEdt)
        val btnSalvar = findViewById<Button>(R.id.btnSalvar)

        btnSalvar.setOnClickListener {
            val nomeEdtR = nomeEdt.text.toString().trim()
            val matriculaEdtR = matriculaEdt.text.toString().trim()

            if(nomeEdtR.isNotEmpty() && matriculaEdtR.isNotEmpty()) {
                var nome = nomeEdtR
                var matricula = matriculaEdtR.toInt()

                var aluno = Aluno(1, nome, matricula)
                alunoRepository.save(aluno)

                var alunoList = alunoRepository.list()
                Toast.makeText(this, "Lista de alunos $alunoList", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, "Favor colocar dados!", Toast.LENGTH_LONG).show()
            }

            //aluno.id = 1
            //aluno.nome = "Joao"
            //aluno.matricula = 12345
        }
    }
}