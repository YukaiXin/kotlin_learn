package Section_6.javaTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by kxyu on 2019/2/19
 */
public class Stack<E> {
    List<E> list = new ArrayList<>();

    public Stack() {

    }

    public void push(E e){
        list.add(e);
    }

    public E pop(){

        return list.remove(0);
    }

    /**
     * PCES : producer-extends, consumer-super
     * JAVA 泛型  ？ extends T 指定类型参数上限，
     *           ？super T 指定类型参数下限
     *
     * Kotlin 中 out T等价于 ？ extends T
     *           in T等价于 ？ super T
     *           * 等价于 ？
     */
//    public void  pushAll(Iterable<E> src){
    public void  pushAll(Iterable<? extends E> src){
        for (E e: src){
            push(e);
        }
    }

    private boolean isEmpty(){
        if (list.size() == 0){
            return true;
        }else {
            return  false;
        }
    }

//    public void popAll(Collection<E> dst){
    public void popAll(Collection<? super  E> dst){
        while (! isEmpty()){
            dst.add(pop());
        }
    }
}
