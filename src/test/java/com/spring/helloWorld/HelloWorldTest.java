package com.spring.helloWorld;

import com.spring.beans.Employee;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class HelloWorldTest extends TestCase {

    @Test
    public void test() throws SQLException {
        //创建容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //IOC容器获取对象
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.sayHello();

        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }

}