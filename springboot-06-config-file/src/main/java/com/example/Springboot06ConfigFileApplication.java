package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 定义了配置文件不同的放置的位置；而放在不同位置的优先级时不同的。
 * SpringBoot 中4级配置文件放置位置：
 * 1级：classpath：application.yml     resource目录下 最低
 * 2级：classpath：config/application.yml
 * 3级：file ：application.yml         jar包所在的目录
 * 4级：file ：config/application.yml                最高
 * 级别越高优先级越高
 */
@SpringBootApplication
public class Springboot06ConfigFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06ConfigFileApplication.class, args);
    }

}
