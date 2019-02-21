package Section_10

class Department {
    private var id: Long = -1L
    var name: String = "Dept"
    var isOpen: Boolean = true
    var isBig: String = "Y"

    /**
     * @JvmField Kotlin编译器在处理的时候，将不会给这个字段生成getters/setters方法
     */
    @JvmField var NO = 0
}