package Section_5

/**
 * Created by kxyu on 2019/2/14
 */
class testls {


}

/** 我是main入口函数 **/
fun main(args: Array<String>) {
   test(10000)
}

fun test(a: Int ){

    val list1 = listOf(1,2,3,4,5)

    val list2 = mutableListOf<Int>(10)

    println(list1.size)
    println(list2.size)
}