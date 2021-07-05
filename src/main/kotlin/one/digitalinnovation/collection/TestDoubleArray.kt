package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray(5)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 700.0
    salarios[3] = 600.0
    salarios[4] = 5000.0

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1

    }
    salarios.forEach { println(it) }
    println("===========================================")
    val salarios2 = doubleArrayOf(1500.1,1552.0,600.3,2040.0)

    salarios2.forEachIndexed { index, salario ->
        salarios2[index] = salario * 1.1

    }
    salarios.forEach { println(it) }
}