package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2,3,4,5,80,7,25,15,16,26,26)

    for ( valor in values){
        println(valor)
    }
 println("=====================Foreach=====================")
    values.forEach {

    }
    println("=====================sort()=====================")
    values.sort()
    for (valor in values){
        println(valor)
    }
}