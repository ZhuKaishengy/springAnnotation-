package com.aisino.test;

import com.aisino.bean.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhukaishengy on 2018-3-16.
 */
public class xmlTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        Person person = (Person)classPathXmlApplicationContext.getBean("person");
        System.out.println(person);
    }
}
