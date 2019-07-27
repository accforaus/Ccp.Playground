//package kotlin.text


fun main () {
    println(hey("WATCH OUT!") == "whoa, chill out!")
   println(hey("FCECDFCAAB") == "whoa, chill out!")
   println(hey("Does this cryogenic chamber make me look fat?") == "Sure.")
    println(hey("You are, what, like 15?") == "Sure.")
    println(hey("fffbbcbeab?") == "Sure.")
    println(hey("Let's go make out behind the gym!") == "Whatever.")
   println(hey("") == "Fine. Be that way!")
    println(hey("  ") == "Fine. Be that way!")
}


fun hey (message: String) :  String {
    //var list = listOf(message)
    var result = ""

    var check: Char
    var upper = message.toUpperCase()
    var empty = message.isNullOrBlank()

    if (empty) return "Fine. Be that way!"
    else check = message[message.length - 1]



     if (check == '?')
    {
        result = "Sure."
    }

    else if (upper == message)
    {
        result = "whoa, chill out!"
    }


    else if (upper == message && check == '?' )
    {
        result = "Calm down, I know what I'm doing!"
    }

    else { result = "Whatever."}

    return result
}
