package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClientTipo

fun main(){
    ClientTipo.values().forEach { elemento->
        println("${elemento.name} = ${elemento.descricao}")
    }
    ClientTipo.values().forEach {
        println("${it.name} = ${it.descricao}")
    }
    val pf = ClientTipo.PF
    val pj = ClientTipo.PJ
    println("${pf.name} = ${pf.descricao}")
    println("${pj.name} = ${pj.descricao}")
}