package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main(){
    val rafael = Pessoa(nome = "Rafael", cpf = "123.123.123-50" )
    println(rafael.nome)
    println(rafael.cpf)

    val roger = Funcionario(nome = "roger", cpf="122.122.122-50", salario = BigDecimal.valueOf(2000.0))
    println(roger.nome)
    println(roger.cpf)
    println("Salario de roger = R$ ${roger.salario}")

}