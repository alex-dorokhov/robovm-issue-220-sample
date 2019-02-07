import kotlinx.coroutines.runBlocking

fun main() {
    // this compiles
//    println("Hello world")

    // this does not compile
    runBlocking {
        println("Hello world")
    }
}