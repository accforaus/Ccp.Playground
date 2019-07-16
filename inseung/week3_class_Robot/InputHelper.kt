import java.util.*

object InputHelper {
    private lateinit var scanner: Scanner

    fun getInt() : Int {
        scanner = Scanner(System.`in`)
        return scanner.nextInt()
    }

    fun getString() : String {
        scanner = Scanner(System.`in`)
        return scanner.nextLine()
    }

    fun getWord () : String {
        scanner = Scanner(System.`in`)
        return scanner.next()
    }
}