package Section_5

/**
 * Created by kxyu on 2019/2/15
 */
fun main(args: Array<String>) {
    println(" 学习 Map")


    val emptyMap = emptyMap<Int, String>()
    val emptyMap2 = mapOf<Int, String>()

    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(" map : "+map+"  map entries : "+map.entries)

    println("  map  keys :  "+map.keys + " map keys::class  "+map.keys::class)
    println("  Map containsKey() :  "+map.containsKey(1))
    println("  Map getOrDefault :  "+map.getOrElse(4, {"four"}))
    println("  遍历Map  forEach  component1() component2()  ")
    map.entries.forEach({

        print(" 1 key : "+it.component1() +"    ===== value : "+it.component2() )
        print("        ")
        }
    )

    print("      \n  ")
    for ((k, v) in map){

        print(" 2 key : "+ k +"    ===== value : "+ v )
    }

    print("      \n  ")

    val mmap = map.mapKeys { it.key * 10 }
    println(" mapKeys{} 如果有两个key 运算后相等，后面的key覆盖前面的   : "+mmap)

    println(" filterKeys{}  > 2  : "+map.filterKeys { it > 2 })
    println(" filterKeys{}  > 2  : "+map.filterValues { it.equals("one")})

    val pairList = listOf(1 to "one one", 2 to "two two", 3 to "three three" )
    println(" toMap()  "+pairList.toMap())

    println(" plus()  "+map.plus(mmap))

}

