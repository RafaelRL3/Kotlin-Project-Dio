package one.digitalinnovation.digionebank
// o gerente herda os comportamentos de Funcionario, logo os val e as funcoes presente e implementa
// A logavel eh uma interfarce que possui o metodo loguin eque eh implementada pelo gerente
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel{
    override fun calcAux(): Double = salario * 0.4
    override fun login(): Boolean = "s12345" == senha
}