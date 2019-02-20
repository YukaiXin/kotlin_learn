package Section_6.javaTest;

import java.util.List;

/**
 * Created by kxyu on 2019/2/19
 */
public class Animals {

    public void act(List<? extends Animals> list){
        for (Animals animals : list){
            animals.eat();
        }
    }

    public void HuskyDog(List<? super HuskyDog> huskuyDogs){
        System.out.println("  哈士奇 ");
    }

    public void eat(){
        System.out.println(" Eating !!!");
    }
}
