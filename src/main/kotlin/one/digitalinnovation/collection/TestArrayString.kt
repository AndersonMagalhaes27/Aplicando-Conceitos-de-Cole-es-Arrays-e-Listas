package one.digitalinnovation.collection

fun main() {
    val nome = Array<String>(3){""}
    nome[0] = "Anderson "
    nome[1] = "Souza "
    nome[2] = "Magalhaes "

    for(nomes in nome){
        println(nomes)
    }


val nome2 = arrayOf("Anderson","Souza","Magalhaes")

for(nomes1 in nome2){
    println(nomes1)

}

}