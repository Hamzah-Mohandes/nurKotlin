package com.example.nurkotlin

class ProblemLoser {

}

data class  User(val name: String, val age: Int)



// Enums

enum class Color {
    RED,
    GREEN,
    BLUE
}

fun main() {
    val color = Color.GREEN
    when (color) {
        Color.RED -> println("The color is red")
        Color.GREEN -> println("The color is green")
        Color.BLUE -> println("The color is blue")
    }

    val shape: Shape = Shape.Circle(5)
    when (shape) {
        is Shape.Circle -> println("The shape is a circle with radius ${shape.radius}")
        is Shape.Square -> println("The shape is a square with side length ${shape.sideLength}")
        is Shape.Rectangle -> println("The shape is a rectangle with width ${shape.width} and height ${shape.height}")
    }
}




// Sealed
sealed class Shape {
    class Circle(val radius: Int) : Shape()
    class Square(val sideLength: Int) : Shape()
    class Rectangle(val width: Int, val height: Int) : Shape()
}