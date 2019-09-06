package com.flin.spring.java.headfirst.factory.multiple;

import com.flin.spring.java.headfirst.factory.Fruit;
import com.flin.spring.java.headfirst.factory.fruitimpl.Apple;

/**
 * <p>
 *
 * @author F_Lin fengjunlin@modnim.com
 * @date 2019/9/6 10:02
 **/
public class AppleFruitManor implements MultipleFruitManor {

    @Override
    public Fruit cultivateFruit() {
        return new Apple().setName("app1").setColor("reddddd");
    }

}
