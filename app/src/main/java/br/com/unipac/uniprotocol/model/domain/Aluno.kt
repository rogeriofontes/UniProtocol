package br.com.unipac.uniprotocol.model.domain

data class Aluno(var id: Long = 0,
                 var nome: String = "",
                 var matricula: Int = 0
)

//private -> atributos -> open
//todo atributo tem get e set - properties.
//hash code e equals
//toString

/*fun main() {
    var aluno = Aluno();

    aluno.id = 1
    aluno.nome = "Rogerio"
    aluno.matricula = 1234

    println("Dados do Aluno ${aluno.toString()}")
}*/