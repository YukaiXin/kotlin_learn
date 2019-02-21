package Section_10

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.*

/**
 * Created by kxyu on 2019/2/20
 */


@RunWith(JUnit4::class)
class KotlinUsingJavaTest {
    @Test
    fun testArrayList() {
        val source = listOf<Int>(1, 2, 3, 4, 5)
        // 使用Java的ArrayList
        val list = ArrayList<Int>()
        for (item in source) {
            list.add(item) // ArrayList.add()
        }
        for (i in 0..source.size - 1) {
            list[i] = source[i] // 调用 get 和 set
        }

        println(" Test ")
    }
}

@RunWith(JUnit4::class)
class ProductTest {
    @Test fun testGetterSetter() {
        val product = Product()
        product.name = "账务系统"
        product.category = "金融财务类"
        product.gmtCreated = Date()
        product.gmtModified = Date()
        println(product.category)
//        println(JSONUtils.toJsonString(product))
        Assert.assertTrue(product.getName() == "账务系统")
        Assert.assertTrue(product.name == "账务系统")
        Assert.assertTrue(product.getCategory() == "金融财务类")
        Assert.assertTrue(product.category == "金融财务类")
    }
}

/**
 * 调用Java 反射特性
 */
@RunWith(JUnit4::class)
class RefectClassTest {
    @Test fun testGetterSetter() {
        val product = Product()
        val pClz = product::class.java
        println(pClz.canonicalName)
        pClz.declaredFields.forEach { println(it) }
        pClz.declaredMethods.forEach {
            println(it.name);
            it.parameters.forEach { println(it) }
        }
    }
}



fun main(args: Array<String>){

    val runnable = Runnable { println("执行测试") } // Kotlin 调用Java的SAM接口方法

    val product : Product = Product()
    val retrun = product.setName("kaixinyu")

    val name = product.category
    name?.substring(1)
    println(retrun)




//    val product1 = Product1("adad", 12);



}