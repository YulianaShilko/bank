fun generateToken(): String {
    val STRING_LENGTH = 10
    val latinUppercase = ('A'..'Z');
    val latinLowercase = ('a'..'z');
    val numbers = ('0'..'9');
    val specialChars = listOf('!', '@', '#', '$', '%', '^', '&', '*');

    return (1..STRING_LENGTH).mapIndexed { index, _ ->
        when (index) {
            in 0..1 -> latinUppercase.random()
            in 2..4 -> latinLowercase.random()
            in 5..7 -> numbers.random()
            else -> specialChars.random()
        }
    }.shuffled().joinToString("");
}

fun main(args: Array<String>) {
    val token = generateToken();
    println(token);

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}