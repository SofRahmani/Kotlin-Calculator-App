var num1: Float = 0F
var num2: Float = 0F

fun addition(val1: Float, val2: Float) {
    val result: Float = val1 + val2
    println(result)
}

fun subtraction(val1: Float, val2: Float) {
    val result: Float = val1 - val2
    println(result)
}

fun multiplication(val1: Float, val2: Float) {
    val result: Float = val1 * val2
    println(result)
}

fun division(val1: Float, val2: Float) {
    if (val1.toInt() == 0|| val2.toInt() == 0) {
        println("Vous ne pouvez pas diviser par 0")
    } else {
        val result: Float = val1 / val2
        println(result)
    }
}

fun main() {
    while (true) {
        println("\nMenu :")
        println("1. Addition")
        println("2. Soustraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Quitter")
        print("Choisissez une option : ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                print("Premier nombre : ")
                num1 = readln().toFloat()
                print("Second nombre : ")
                num2 = readln().toFloat()

                addition(num1, num2)
            }

            2 -> {
                print("Premier nombre : ")
                num1 = readln().toFloat()
                print("Second nombre : ")
                num2 = readln().toFloat()

                subtraction(num1, num2)
            }

            3 -> {
                print("Premier nombre : ")
                num1 = readln().toFloat()
                print("Second nombre : ")
                num2 = readln().toFloat()

                multiplication(num1, num2)
            }

            4 -> {
                print("Premier nombre : ")
                num1 = readln().toFloat()
                print("Second nombre : ")
                num2 = readln().toFloat()

                division(num1, num2)
            }

            5 -> {
                println("Au revoir !")
                break
            }
        }
    }
}