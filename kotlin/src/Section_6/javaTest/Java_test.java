package Section_6.javaTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kxyu on 2019/2/19
 */
public class Java_test {

    public static void main(String[] args){
        Animals animals = new Animals();
        List<Animals>  list = new ArrayList<>();
        list.add(new Dogs());
        list.add(new Cat());
        animals.act(list);


        List<? extends Animals>  list1 = new ArrayList<>();
//        list1.add(new Dogs());
//        list1.add(new Cat());
//        animals.act(list);

        List<Dogs> list2 = new ArrayList<>();
        list2.add(new Dogs());
        list2.add(new Dogs());
        animals.act(list2);
        list1 = list2;
        animals.act(list1);

        List<?> a = new ArrayList<>();
    }




}
