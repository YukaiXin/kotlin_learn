package Section_6.kotlin_test

/**
 * Created by kxyu on 2019/2/19
 */

@Target(AnnotationTarget.CLASS,
AnnotationTarget.FUNCTION,
AnnotationTarget.EXPRESSION,
AnnotationTarget.FIELD,
AnnotationTarget.LOCAL_VARIABLE,
AnnotationTarget.TYPE,
AnnotationTarget.TYPEALIAS,
AnnotationTarget.TYPE_PARAMETER,
AnnotationTarget.VALUE_PARAMETER)

@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class MagicClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class MagicFunction

@Target(AnnotationTarget.CONSTRUCTOR)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class MagicConstructor

@MagicClass class Foo @MagicConstructor constructor(){
    constructor(index: Int): this(){
        this.index = index
    }

    @MagicClass var index: Int = 0;
    @MagicFunction fun magic(@MagicClass name: String){

    }
}