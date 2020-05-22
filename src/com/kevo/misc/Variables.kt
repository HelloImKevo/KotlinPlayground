package com.kevo.misc

/*
Tutorial credits to: https://github.com/dodyg/Kotlin101
 */

// There are two types of variable declarations in Kotlin: mutable and immutable.
// Use var declaration for mutable (changeable) variables and val for immutable
// (unchangeable) variables.
fun main(args: Array<String>) {
    var message = "var means a mutable variable, so you can change it."
    println("'message' variable has this value '$message'")
    message = "Using auto-magical mutability mechanisms, the value is modified!"
    println("now 'message' has this value: '$message'")

    println("")
    val forever = "val means that the variable is immutable. If you try to change " +
            "this 'forever' variable, the compiler will throw an error!"
    print(forever)
    // forever = "potato salad" - I'm sorry, Dave. I'm afraid I can't do that.
}
