package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.ClientTipo
import one.digitalinnovation.digionebank.Cliente

fun main(){
    val luana = Cliente(
        nome = "Luana",
        cpf = "123.124.125-88",
        clientTipo = ClientTipo.PF,
        senha = "123456")
    println(luana)

    TestAutenticacao().autenticacao(luana)
}
