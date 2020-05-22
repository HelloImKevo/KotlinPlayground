package com.kevo.misc

fun main(args: Array<String>) {
    val orwell = "It was a bright cold day in April, and the clocks were striking thirteen."

    // This is a single line string
    println("It was the best of times, it was the worst of times.")

    // Use triple quotes `"""` to use multiline strings.
    // Kotlin also supports Literal String Interpolation (similar to Python), which is
    // variable substitution with its value inside a string.
    // The trimMargin() method uses the pipe character as a margin delimiter.
    println(
        """My favorite quote is by '$orwell', although at ${orwell.length} characters long,
        |it is not compact. This is what George Orwell has to say about
        |Big Brother: "${orwellOnBigBrother()}". Here is a random math equation for your
        |enjoyment: 1 + 1 = ${1 + 1}."
    """.trimMargin()
    )
}

fun orwellOnBigBrother(): String {
    return "The Party seeks power entirely for its own sake. We are not interested in the " +
            "good of others; we are interested solely in power... Power is not a means; " +
            "it is an end... not power over things, but over men... In our world there will " +
            "be no emotions except fear, rage, triumph, and self-abasement... There will be " +
            "no loyalty, except loyalty toward the Party. There will be no love, except the " +
            "love of Big Brother..."
}
