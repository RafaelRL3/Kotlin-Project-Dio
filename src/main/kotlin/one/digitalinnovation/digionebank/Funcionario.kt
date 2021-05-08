package one.digitalinnovation.digionebank

abstract class Funcionario(
     nome: String,
     cpf: String,
    val salario:Double
) : Pessoa(nome, cpf) {
    protected abstract fun calcAux(): Double // So permite a class fun e seus filhos usarem a funcao

    override fun toString(): String = """
     Nome: $nome
     cpf: $cpf
     Salario: $salario
     Auxilio: ${calcAux()}
    """.trimIndent() // sobre escrita da classe object
}//Classe abstrata funcionario que forca a implementacao dos membros