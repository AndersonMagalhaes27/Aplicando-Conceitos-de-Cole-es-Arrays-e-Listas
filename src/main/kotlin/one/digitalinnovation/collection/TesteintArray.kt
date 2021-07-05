package one.digitalinnovation.collection

fun main() {
     val values = IntArray(5,)
    values[0]= 1
    values[1]= 5
    values[2]= 6
    values[3]= 2
    values[4]= 7

        for(valor in values){
            println(valor)
        }
    println("================================= foreach ========================================")
    values.forEach {
        println(it)
    }
        println("================================= indices ========================================")
    for (index in values.indices){
        println(values[index])
    }

    println("================================= sort() // ordena um array  ========================================")
    values.sort()
    for(valor in values){
        println(valor)
    }
}