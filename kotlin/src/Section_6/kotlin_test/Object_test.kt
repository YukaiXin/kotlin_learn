package Section_6.kotlin_test

import java.util.*

/**
 * Created by kxyu on 2019/2/19
 */

/**
 * 匿名object
 * 只可用到私有作用域
 */
fun distance(x: Double, y : Double): Double{
    val porigin = object {
        var x = 0.0
        var y = 0.0
    }

    return Math.sqrt((x - porigin.x)) * (x - porigin.x) + (y - porigin.y) * (y - porigin.y)
}

fun countCompare() : List<Int>{
    var list = mutableListOf(1, 4, 3, 7, 11, 9, 10, 20)
    var countCompare = 0
    Collections.sort(list, object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            countCompare++
            println("countCompare=$countCompare")
            println(list)
            return o1.compareTo(o2)
        }
    })
    return list;
}

class Test{
    companion object {
        val name: String = "伴生对象"
    }
}

fun main(args: Array<String>){
    println("  匿名object  distance ： "+ distance(10.0, 10.0))

    println("   "+ countCompare())

    println("  伴生对象 ： "+Test.name)
}