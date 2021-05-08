package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val roger = Analista(nome = "roger", cpf = "123456789", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(roger)
}
