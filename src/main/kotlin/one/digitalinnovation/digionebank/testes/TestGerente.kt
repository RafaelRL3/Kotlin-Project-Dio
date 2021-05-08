package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Gerente

fun main(){
    val rafael = Gerente(nome = "rafael", cpf = "123456789", salario = 5000.0, senha = "s1234")
    ImprimeRelatorioFuncionario.imprime(rafael)
    TestAutenticacao().autenticacao(rafael)
}
