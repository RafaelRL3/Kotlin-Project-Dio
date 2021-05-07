package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rafael"


    var cpf: String = "123.123.123-11" // eh inicializado mas n pode ser mexido
    private  set //Estou tornando privado a propiedade de alterar as var
    constructor()

    fun PessoaIn() = "$nome e $cpf"

}

fun main(){
    val rafael = Pessoa()
    rafael.nome = "rafael" //Estou setando aq
    println(rafael.PessoaIn())

}