package Section_6.kotlin_test

import javafx.scene.text.FontWeight

/**
 * Created by kxyu on 2019/2/19
 */
 class Box<T>(t: T){
    val value = t

    fun <T> singletonList(item: T): List<T>{
        return listOf<T>()
    }
    fun <T> T.basicToString(): String{
        return ""
    }
}

open class Student constructor(val name: String, val age: Int):Any(){



}
annotation class MyAutowired
class ElementarySchoolStudent public @MyAutowired constructor(name: String, age: Int): Student(name, age){

    var weight: Float = 80.0f

    constructor(name: String, age: Int, weight: Float): this(name, age){
        this.weight = weight;
    }
}

/**
 *  主构造函数是私有的
 */
class DontCreateMe private constructor(){

    /**
     * 可以用次构造函数引用这个主构造函数
     */
    constructor(i: Int): this(){
    }
}

/**
 * 抽象类
 * 1）抽象函数必须为public 或者protected
 * 2）抽象类不能用来创建对象实例
 * 3) 抽象类的子类必须继承抽象类的方法
 */
abstract class Person(var name: String, var age: Int): Any(){
    abstract var addr: String
    abstract var weight: Float
    abstract fun doEat()
    abstract fun doWalk()
    fun doSwim(){
        println("I am Swimming ...")
    }

    /**
     * open 子类中可以复写
     */
    open fun doSleep(){
        println(" I am Sleeping ...")
    }
}

/**
 * 接口
 */
interface ProjectService{
    val name: String
    val owner: String
    fun print(){
        println(" ProjectService ")
    }
}

interface ProjectService1{
    val name: String
    val owner: String
    fun print(){
        println(" ProjectService 1 ")
    }
}

class ProjectServiceImpl(override val name: String, override val owner: String) :ProjectService, ProjectService1{
    override fun print() {
//        super.print()
        super<ProjectService1>.print()
        super<ProjectService1>.print()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}


/** 我是main入口函数 **/
fun main(args: Array<String>) {
    val box: Box<Int> = Box<Int>(1)
    println(" Box class : "+box.value::class+"  Box value : "+box.value)
    val box1 = Box("Name")
    println(" Box class : "+box1.value::class+"  Box value : "+box1.value)
}



