package com.example.nurkotlin


fun main() {
    val list = listOf("a", "b", "c", "d", "e")
    println(list.size)
    println(list.get(2))
    println(list.contains("c"))
    println(list.indexOf("d"))
    println(list.filter { it == "a" || it == "b" })
    println(list.map { it.toUpperCase() })
    println(list.reduce { acc, s -> acc + s })
    println(list.first())
    println(list.last())

    //first() und last() geben das erste und letzte Element der Liste
    //wenn die Liste leer ist, wirft es eine NoSuchElementException
    println(list.first())
    println(list.last())

    //get() gibt das Element an der gegebenen Position zurück
    //wenn die Liste leer ist, wirft es eine NoSuchElementException
    //wenn die Position größer als die Liste ist, wirft es eine IndexOutOfBoundsException
    println(list.get(3))

    //contains() prüft, ob ein bestimmtes Element in der Liste ist
    println(list.contains("c"))

    //indexOf() gibt die Position des ersten Vorkommens des bestimmten Elements zurück
    //wenn das Element nicht in der Liste ist, gibt es -1 zurück
    println(list.indexOf("d"))

    //filter() gibt eine neue Liste mit allen Elementen zurück, die die Bedingung erfüllen
    //hier alle Elemente mit "a" oder "b"
    println(list.filter { it == "a" || it == "b" })

    //map() gibt eine neue Liste mit allen Elementen zurück, die mit der Funktion umgewandelt wurden
    //hier alle Elemente in Großbuchstaben umwandeln
    println(list.map { it.toUpperCase() })

    //reduce() gibt ein einziges Element zurück, das mit allen Elementen der Liste verrechnet wurde
    //hier alle Elemente zu einem String zusammenfügen
    println(list.reduce { acc, s -> acc + s })


    //Aufgabe: Erstelle eine Funktion, die alle Elemente der Liste mit einem bestimmten Prefix versehen soll
    //Beispiel: prefixList(listOf("a", "b", "c"), "x") -> listOf("xa", "xb", "xc")
    val list2 = listOf("a", "b", "c")

    //Ich habe eine Funktion erstellt, die alle Elemente der Liste mit einem bestimmten Prefix versehen soll
    //Beispiel: prefixList(listOf("a", "b", "c"), "x") -> listOf("xa", "xb", "xc")
    fun prefixList( list2: List<String> , prefix: String ): List< String > {
        return list2.map {
            prefix + it
        }
    }

    println(prefixList(list2, "x"))

    //Aufgabe: Erstelle eine Funktion, die alle Elemente der Liste in aufsteigender Reihenfolge sortiert
    //Beispiel: sortList(listOf("b", "a", "c")) -> listOf("a", "b", "c")
    val sortList6 = listOf(2,4,1,3)

    println(sortList6.sorted())


    // ich will eine

}