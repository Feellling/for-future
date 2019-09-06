package com.flin.spring.java.headfirst.builder.impl;

import com.flin.spring.java.headfirst.builder.IManorBuilder;
import com.flin.spring.java.headfirst.builder.Manor;

/**
 * <p>
 *
 * @author F_Lin fengjunlin@modnim.com
 * @date 2019/9/6 11:00
 **/
public class OrangeManorBuilder implements IManorBuilder {
    @Override
    public Manor builderManor(String masterName) {
        return new OrangeManor(masterName);
    }
}
