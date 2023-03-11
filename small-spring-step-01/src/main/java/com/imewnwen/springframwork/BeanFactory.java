package com.imewnwen.springframwork;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Imwenwen
 * @description:  Bean 对象的工厂，可以存放 Bean 定义到 Map 中以及获取
 * @date: 2023/3/11 16:32
 * @version: 1.0
 */
public class BeanFactory {


    private Map<String,BeanDefinition> beanDefinitionMap =new ConcurrentHashMap<String,BeanDefinition>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name , BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
