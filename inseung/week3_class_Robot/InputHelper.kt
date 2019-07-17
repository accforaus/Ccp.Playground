import java.lang.NumberFormatException
import java.util.*

object InputHelper {
    private lateinit var scanner: Scanner

    fun getInt() : Int {
        scanner = Scanner(System.`in`)
        try {
            return scanner.nextInt()
        } catch (e: InputMismatchException) {
            print("다시 입력해주세요 : ")
            return getInt()
        }
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