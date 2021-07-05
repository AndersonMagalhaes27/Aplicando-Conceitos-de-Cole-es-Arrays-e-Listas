package one.digitalinnovation.collection

fun main (){
    val Joao = funcionario ("Joao", 5000.0, "Clt")
    val Maria = funcionario ("Maria", 3000.0,"Pj")
    val Luiz = funcionario ("Luiz", 2000.0,"Clt")

    var funcionario1 = setOf(Joao, Maria)
    var funcionario2 = setOf(Luiz)

    funcionario1.union(funcionario2).forEach{ println(it)}

    println("================")

    var funcionario3 = setOf(Joao,Maria,Luiz)

    funcionario3.subtract(funcionario2).forEach { println(it) }
    println("================")
    funcionario3.intersect(funcionario2).forEach { println(it) }
}