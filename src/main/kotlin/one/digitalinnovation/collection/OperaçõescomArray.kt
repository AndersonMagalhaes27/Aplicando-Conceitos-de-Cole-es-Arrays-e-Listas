package one.digitalinnovation.collection

fun main() {


    val salarios = arrayOf(1500,3000, 600, 2040)

    for (salario in salarios) {
        println(salario)
    }
    println("========================")
    println("Maior Salario " + salarios.maxOrNull())
    println("Menor Salario " + salarios.minByOrNull { it })
    println("Media Salario " + salarios.average())

    println("========================")

    val salariomaiorque2500 = salarios.filter { it > 2030 }

    salariomaiorque2500.forEach { (println(it)) }

    println("========================")

    println(salarios.count { it in 2000..5000 })
}