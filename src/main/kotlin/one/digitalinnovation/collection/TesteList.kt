package one.digitalinnovation.collection

fun main() {
    val Joao = funcionario ("Joao", 5000.0, "Clt")
    val Maria = funcionario ("Maria", 3000.0,"Pj")
    val Luiz = funcionario ("Luiz", 2000.0,"Clt")

    val funcionarios = listOf(Joao,Maria,Luiz)

    funcionarios.forEach { println(it) }

            println("========================")

    println(funcionarios.find { it.nome == "Maria" })

            println("========================")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }
            println("========================")

    funcionarios.groupBy { it.contratacao }.forEach{println(it)}
}

