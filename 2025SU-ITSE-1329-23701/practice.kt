/*
* Objective: Kotlin Practice Code File
* Class: 2025 SU ITSE-1329-23701
* Instructor: Professor Vo
* Student: Angel Silva, ID 2521604
* Date: ##/##/2025
*/

fun main(args: Array<String>) {
    println("i love Python")
    println("TESTing")
    for (i in 5..10) {
        if (i == 8) {
            continue
        } else {
            println("skip ${i}")
        }
        println(i)
    }
}