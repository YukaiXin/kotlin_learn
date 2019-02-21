package Section_10

class CheckKotlinException {
    fun thisIsAFunWithException() {
        throw Exception("I am an exception in kotlin")
    }

    @Throws(Exception::class)
    fun thisIsAnotherFunWithException() {
        throw Exception("I am Another exception in kotlin")
    }
}

fun main(args: Array<String>){
    val checkKotlinException = CheckKotlinException()
    checkKotlinException.thisIsAFunWithException()
}