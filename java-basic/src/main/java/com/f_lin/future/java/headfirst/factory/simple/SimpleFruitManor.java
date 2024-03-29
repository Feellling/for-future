package com.f_lin.future.java.headfirst.factory.simple;

import com.f_lin.future.java.headfirst.factory.Fruit;
import java.lang.reflect.InvocationTargetException;

/**
 * 简单工厂模式//一个静态方法
 * <p>
 *
 * @author F_Lin fengjunlin@modnim.com
 * @date 2019/9/6 9:55
 **/
public class SimpleFruitManor {

    public static <T extends Fruit> T cultivateFruit(Class<T> tClass) {
        T t = null;
        try {
            t = tClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return t;
    }
}
