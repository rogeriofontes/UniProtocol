package br.com.unipac.uniprotocol.model.domain

import android.content.Context
import android.util.Log

class AlunoRepository(context: Context) {
    var alunos: ArrayList<Aluno>? = null

    fun save(aluno: Aluno) {
        alunos?.add(aluno)
    }

    fun list() : ArrayList<Aluno>? {
        return alunos
    }
}