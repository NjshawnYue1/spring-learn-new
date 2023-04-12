package com.ga.config;

import com.ga.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author guan
 *
 * 相当于一个xml 文件
 */
@Configuration
@ComponentScan
public class JavaConfig {

    @Bean
    public User user(){
        return new User();
    }
}
