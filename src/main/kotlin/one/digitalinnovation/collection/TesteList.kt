package one.digitalinnovation.collection

fun main() {
    val Joao = funcionario ("Joao", 5000.0)
    val Maria = funcionario ("Maria", 3000.0)
    val Luiz = funcionario ("Luiz", 2000.0)

    val funcionarios = listOf(Joao,Maria,Luiz)

    funcionarios.forEach { println(it) }
    println("========================")
    println(funcionarios.find { it.nome == "Maria" })

}
data class funcionario (
    val nome:String,
    val salario:Double
){
    override fun toString():String =
        "Nome: $nome     Salario: $salario ".trimIndent()


}