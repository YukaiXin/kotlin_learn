import com.sun.org.apache.bcel.internal.generic.GOTO

/**
 * Created by kxyu on 2019/2/14
 */
/** 我是main入口函数 **/
fun main(args: Array<String>) {
    val array = arrayOf(3, 2, 10, 7, 8, 4, 15, 1, 6)

    quickSort(array, 0, array.size -1)
    print("   快排 : ")
    array.forEach { print(" $it ") }

    println()
    print("   冒泡 : ")
    bubbleSort(array)
    println()
    println("   算法题 ")
    val num = 174037401290
    getMixNum(num)
}

fun getMixNum(num: Long): String {
    var str = num.toString().toCharArray()

    for (i in str.size - 1 downTo 0) {
        val currentNum = str[i].toInt()
        for (j in str.size - 2 downTo 0) {

            if (currentNum > str[j].toInt()) {
                var tmp = str[j]
                str[j] = currentNum.toChar()
                str[i] = tmp
                println(" 结果 ： " + str.contentToString())
                return str.contentToString()
            }
        }
    }
    return num.toString()
}

fun bubbleSort(array: Array<Int>){

    for (i in 0 until array.size){
        var currentNum = array[i]

        for (j in (i+1) until array.size){
            if(currentNum > array[j]){
                array[i] = array[j]
                array[j] = currentNum
                currentNum = array[i]
            }
        }
    }
    array.forEach { print(" $it ") }
}

fun quickSort(array: Array<Int>, left: Int, right: Int):Array<Int>{
    if (right <= left ) return array
    var currentNum = array[left]
    var i = left
    var j = right

    while (i != j){
        while (i < j && array[j] >= currentNum)
            j --

        while (i < j && array[i] <= currentNum)
            i ++

        if(i < j){
            var temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }
    array[left] = array[i]
    array[i]    = currentNum

    quickSort(array, left, i-1)
    quickSort(array, i+1 , right)

    return array
}



