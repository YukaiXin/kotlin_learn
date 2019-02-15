package Section_5

/**
 * Created by kxyu on 2019/2/15
 */
fun main(args: Array<String>) {
    println(" 学习 Set")

    val emptySet = emptySet<Int>()
    println("  空Set  "+emptySet+" size : "+emptySet.size+" hashcode : "+emptySet.hashCode())
    val s = setOf<Int>()
    println("  空Set  "+s+" size : "+s.size+" hashcode : "+s.hashCode())
    /***
     * Set
     * 创建Set
     * SetOf()
     * mutableSetOf()  创建一个可变Set
     */
    val set = setOf(1, 1, 2, 3, 3)
    println(" set不可重复  "+set)
}

