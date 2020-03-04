package com.spring.annotation;

import com.spring.annotation.dao.UserDao;
import com.spring.annotation.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class AnnotationTest extends TestCase {

    //创建容器
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test() throws SQLException {

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.saveUser();
    }

}