fun hey (message: String) : String {
    fun isAllCaps (input: String) = input == input.toUpperCase()
    fun isQuestion (input: String) = input.last() == '?'

    return if (message.isBlank()) "Fine. Be that way!"
    else if (isQuestion(message)) {
        if (isAllCaps(message)) "Calm down, I know what I'm doing!"
        else "Sure"
    }
    else if (isAllCaps(message)) "Whoa, chill out!"
    else "Whatever"

}

fun main () {
    println(hey("WATCH OUT!") == "Whoa, chill out!") // output `true`
    println(hey("FCECDFCAAB") == "Whoa, chill out!") // output `true`
    println(hey("Does this cryogenic chamber make me look fat?") == "Sure") // output `true`
    println(hey("You are, what, like 15?") == "Sure") // output `true`
    println(hey("fffbbcbeab?") == "Sure") // output `true`
    println(hey("Let's go make out behind the gym!") == "Whatever") // output ``true`
    println(hey("") == "Fine. Be that way!") // output `true`
    println(hey("   ") == "Fine. Be that way!") // output `true`
}