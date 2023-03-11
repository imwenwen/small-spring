package com.imwenwen;

import com.imewnwen.springframwork.BeanDefinition;
import com.imewnwen.springframwork.BeanFactory;
import com.imwenwen.bean.UserService;
import org.junit.Test;

/**
 * @author: Imwenwen
 * @description: 测试类
 * @date: 2023/3/11 16:38
 * @version: 1.0
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
