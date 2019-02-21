package Section_8

/**
 * Created by kxyu on 2019/2/20
 */

fun main(args: Array<String>){

    val I = {x: Int -> x}

    println(I(100))

    val addOneLambda = {
                 x: Int ->
                 x + 1
             }
    println(addOneLambda(2))

    val addOneAnonyLambda= ( fun(x: Int): Int{
        return x + 1
    }
            )

    println(addOneLambda(3))

    closureDemo()
}

fun closureDemo() {
    Thread({
        for (i in 1..10) {
            println("I = $i")
            Thread.sleep(1000)
        }

    }).start()

    Thread({
        for (j in 10..20) {
            println("J = $j")
            Thread.sleep(2000)
        }
        Thread.sleep(1000)
    }).start()
}


fun factorial(n: Int): Int {
    println("factorial() called!  n=$n")
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
