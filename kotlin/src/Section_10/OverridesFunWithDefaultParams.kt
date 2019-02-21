package Section_10

class OverridesFunWithDefaultParams {
    fun f1(a: Int = 0, b: String = "B") {
        println(" f1     A : $a   B : $b ")
    }

    @JvmOverloads fun f2(a: Int = 0, b: String = "B") {

        println(" f2     A : $a   B : $b ")
    }
}


fun main(args: Array<String>){

    val o = OverridesFunWithDefaultParams();
    o.f1()
    o.f1(1)




}