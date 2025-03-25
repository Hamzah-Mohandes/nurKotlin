package com.example.nurkotlin

class ProblemLoser {

}


fun main() {
     println("du erwachst in einem dunklen Raum , Was tust du?")
    println("1. Umsehen")
    println("2. Rufen")

    val antwort = readln()

    when(antwort){
     "1" -> println("du sihst eine schwache Lampe und eine Tür.")
     "2" -> println("Niemand antwortet. Es ist still")
     else -> println("Du tust nichts.")
    }
}