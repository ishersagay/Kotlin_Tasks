/**
 * Sum of multiples
 * Date Wednesday 23rd December
 * https://exercism.io/tracks/kotlin/exercises/sum-of-multiples/solutions/4ebfa2d1071f4fd9afafdc3e635bb3e1
 */
import java.util.Scanner

fun main() {

    val keyboard = Scanner(System.`in`)

    println("Sum of multiples\nEnter in a range, first multiple: ")
    val range : Int = keyboard.nextInt()
    val multiple : Int = keyboard.nextInt()
    print("Enter in second multiple: ")
    val secondMultiple : Int = keyboard.nextInt()
    var store : Int = 0

    for (x in 0 until range) {

        if (x % multiple == 0 || x % secondMultiple == 0) {
            println(x)
            println("It is a multiple of $multiple")


            store += x
        }

    }
    println("The total is $store")
}
