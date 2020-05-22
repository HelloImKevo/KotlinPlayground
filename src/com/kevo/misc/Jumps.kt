package com.kevo.misc

/*
Documentation: https://kotlinlang.org/docs/reference/returns.html
 */

/**
 * Kotlin has three structural jump expressions:
 * - return: By default returns from the nearest enclosing function or anonymous function.
 * - break: Terminates the nearest enclosing loop.
 * - continue: Proceeds to the next step of the nearest enclosing loop.
 */
fun main(args: Array<String>) {
    // Any expression in Kotlin may be marked with a label. Labels have the form of
    // an identifier followed by the '@' sign.
    loop@ for (i in 1..50) {
        print("$i,")
        if (i == 25) {
            break@loop
        }
    }
    println("")
    println("end of line")

    // The return-expression returns from the nearest enclosing function. If we need to
    // return from a lambda expression, we have to label it and qualify the return.
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) {
            // Local return to the caller of the lambda, i.e. the forEach loop
            return@lit
        }
        // Print currently iteration value.
        print(it)
    }
    print(" done with explicit label")
}
