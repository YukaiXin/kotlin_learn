package Section_5

/**
 * Created by kxyu on 2019/2/15
 */
fun main(args: Array<String>) {
    println(" 学习 List")

    /***
     * List
     * 不可变集合类 List
     * 可变集合类   MutableList
     */

    ImmutableList()

    MutableList()

    PlayList()
}

/***
 * 不可变集合类List
 */
fun ImmutableList(){

    println(" \n ***   不可变集合类List    ***")
    val list:List<Int> = listOf()
    println(list)
    println(list::class) // class kotlin.collections.EmptyList

    val list_1 = listOf(1)
    println(list_1)
    println(list_1::class) // class java.util.Collections$SingletonList

    val list_more = listOf(1, 2, 3, 4, 5, 6)

    println(list_more)
    println(list_more::class) // class java.util.Arrays$ArrayList

    val list_array = arrayListOf(0, 1, 2, 3) /*** 直接创建 Java 中的 ArrayList */
    println(list_array)
    println(list_array::class) // class java.util.ArrayList

    list.toMutableList() /*** 不可变List 转换成可变 List*/

}

/***
 * MutableList
 * 除了继承List
 * 新增 add/addAll, remove/removeAll/removeAt, Map, clear, retainAll 等
 */
fun MutableList(){

    println(" \n ***   MutableList    ***")
    val list = mutableListOf(1, 2, 3)
    println(list)
    println(list::class) // class java.util.ArrayList

    val list1 = mutableListOf<Int>()
    println(list1)
    println(list1::class) // class java.util.ArrayList

    val list0 = mutableListOf(1)
    println(list0)
    println(list0::class) // class java.util.ArrayList

}

fun PlayList(){

    println(" \n ***   遍历 List    ***")
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val iterator = list.iterator()
    println(iterator)
    while (iterator.hasNext()){
        print(iterator.next())
        print("  ")
    }

    println()
    list.forEach( /*** 两种写法 ***/
            {
                println(it)
            }
//        ::print
    )

    val mutableList = list.toMutableList()
    // add  addAll remove removeAt

    println(" \n ***  结合类的操作    ***")
    mutableList.set(0, 1000)
    println(" mutableList : "+mutableList)

    //retainAll 取两集合的交集
    val mlist1 = mutableListOf(1, 2, 3, 4, 5)
    val mlist2 = mutableListOf(3, 4, 5, 6, 7, 8, 9, 5)
    println(mlist1.retainAll(mlist2))
    println(" 两结合的交集 ： "+mlist1)
    println(" 包含元素  "+list.containsAll(mlist1))
    println(" elementAt 查找对应下表的元素  "+mlist2.elementAt(2))
    println(" elementAtOrElse 针对越界，返回制定的元素  "+mlist2.elementAtOrElse(10, {1000}))
    println(" elementAtOrNull 越界返回  "+mlist2.elementAtOrNull(10))

    println(" first()集合第一个元素  ： "+mlist2.first())
    println(" firstOrNull()集合第一个元素 不符合条件返回null  ： "+mlist2.firstOrNull({it > 1}))
    println(" singleOrNull()集合唯一一个元素，不符合条件或多个 返回null  ： "+mlist2.singleOrNull({it == 5}))
    println(" \n ***  结合类的基本运算   ***")
    val list2 = mutableListOf(1, 2, 3, 4, 5, 6)
    println(" any()至少有一个元素  满足： "+list2.any({it > 100}))
    println(" all()所有元素  满足： "+list2.all({it > 0}))
    println(" none()集合中没有任何元素  ： "+mlist2.none())
    println(" count()集合中满足条件的元素个数   ： "+list2.count({it > 4}))

    val list3 = mutableListOf("a", "b", "c")
    println(" reduce()累计运算 "+list2.reduce { sum, next -> sum + next })
    println(" reduceRight()后往前 累计运算 "+list3.reduceRight{ sum, next -> next + sum })
    println(" fold()带初始值的累计运算 "+list2.fold(100, {sum, next -> sum + next }))
    list2.forEach{ value -> if(value > 4) println(value)}
    list2.forEachIndexed{index, value -> if(value > 4) println(" index : $index  value : $value ")}

    println(" take() 挑出n个元素 "+list2.take(3))
    println(" takeLast() 挑出后n个元素 "+list2.takeLast(3))
    println(" takeLastWhile() 挑出后n个满足条件的元素 "+list2.takeLastWhile { it >3 })
    println(" takeWhile() 挑出n个满足条件的元素 "+list2.takeWhile { it >3 })
    println(" drop() 去除前n个元素 "+list2.drop(3))
    println(" dropWhile() 去除前n个满足条件的元素 "+list2.dropWhile { it < 2 })
    println(" dropLastWhile() 去除后n个满足条件的元素 "+list2.dropLastWhile { it > 3 })
    println(" slice 返回回开始下标至结束下标的集合  ：  "+list2.slice(1..3))
    println(" slice 返回指定下标的集合  ：  "+list2.slice(listOf(1,2,4)))
    println(" filter() 把满足过滤条件的元素返回 "+list2.filter { it > 3 })
    println(" filterNot() 把不满足过滤条件的元素返回 "+list2.filterNot { it > 3 })
    println(" filterNotNull() 过滤null元素 "+list2.filterNotNull() )

    println(" map() "+list2.map { it +10})
    println(" mapIndexed() "+list2.mapIndexed { index, i ->  index * i })
    val list4 = mutableListOf("a", "b", null, "c", "d", "", "w")
    println(" mapNotNull()  "+list4.mapNotNull{it})
    println("   map() 与 flatMap() 对比 : "+list2.map {  it -> listOf(it + 1, it + 2, it + 3) })
    println("   map() 与 flatMap() 对比 : "+list2.flatMap { it -> listOf(it + 1, it + 2, it + 3) })


    val strList = listOf("a", "abc", "c", "dsa", "ca", "o", "22")
    println(" \n 分组操作函数 *******  "+strList)
    println("  groupBy{} 分组 按条件分组 "+strList.groupBy { it.length })

    val provinceList = listOf("黑龙江" to "哈尔滨", "辽宁" to "沈阳", "广东" to "广州", "山东" to "济南")
    println("  groupBy() "+provinceList.groupBy({it.first},{it.second}))

    val words = "one two three four five six seven eight nine ten".split(" ")
    println(" groupingBy() "+words.groupingBy({it.substring(0, 1)}).eachCount())

    println(" sortedBy（）根据函数映射结果进行排序 升序或倒序 ： "+strList.sortedBy { it.length })

    val list11 = mutableListOf(1, 2, 3)
    val list22 = mutableListOf("a", "b", "c", "d")
    val list33 = mutableListOf(4, 5, 6)

    println(" zip(） 两个集合按照下标配对，组合成的每个Pair作为新的List集合中的元素，并返回 "+list11.zip(list22))
    println(" zip(other，{}） 两个集合按照下标配对，组合成的每个Pair作为新的List集合中的元素，并返回 "+list11.zip(list33, {t1 , t2 -> t1 * t2}))
    val listPair = listOf(Pair(1, 2), Pair(3, 4), Pair(5, 6))
    println(" unzip  "+listPair.unzip())
    println(" partition()  "+mlist2.partition { it > 5 })
    println(" plus 合并 "+list11.plus(listOf(10, 11, 12)))
    println(" plus 合并 "+list11.plusElement(1000))

}