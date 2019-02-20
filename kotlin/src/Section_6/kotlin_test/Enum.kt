package Section_6.kotlin_test

/**
 * Created by kxyu on 2019/2/19
 */
enum class Direction{
    NORTH, SOUTH, WEST, EAST
}

/**
 * 可以定义枚举的属性
 */
enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/**
 * 匿名类
 */
enum class ActivityLifeState{

    onCreate {
      override fun signal() = onStart
    },
    onStart {
        override fun signal() = onStop
    },

    onStop {
        override fun signal() = onStart
    };

    abstract fun signal(): ActivityLifeState
}



/** 我是main入口函数 **/
fun main(args: Array<String>) {
    val north = Direction.NORTH
    println(north)
    println(north.ordinal)

    val red = Color.RED
    println(red.rgb)
    val rgbs = enumValues<Color>().joinToString { "${it.name} : ${it.rgb}" }
    println(" enumValues   "+rgbs)

    val s = ActivityLifeState.onCreate
    println(" 匿名内部类  "+ s.signal())
}