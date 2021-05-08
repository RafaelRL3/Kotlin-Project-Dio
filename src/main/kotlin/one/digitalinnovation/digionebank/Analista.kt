package one.digitalinnovation.digionebank

class Analista (
    nome:String,
    cpf:String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calcAux() = salario + (salario*0.1)
}