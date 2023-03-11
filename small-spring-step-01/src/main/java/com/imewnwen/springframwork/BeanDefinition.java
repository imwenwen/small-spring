package com.imewnwen.springframwork;

import java.util.Objects;

/**
 * @author: Imwenwen
 * @description: 用于定义 Bean 实例化信息
 * @date: 2023/3/11 16:32
 * @version: 1.0
 */
public class BeanDefinition {


    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
