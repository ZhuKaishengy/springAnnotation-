package com.aisino.config;

import com.aisino.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhukaishengy on 2018-3-16.
 */
@Configuration
public class MyConfig {

    @Bean("person-test")
    public Person person(){
        return new Person("9999","sjx",21);
    }
}
