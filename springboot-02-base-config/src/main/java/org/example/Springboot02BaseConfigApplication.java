package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置文件格式：
 * 1.properties server.port=8081
 * 2.yml        server:
 *                  port: 8081
 * 3.yaml 同上
 * 三种配置文件的优先级是：
 * application.properties > application.yml > application.yaml
 */
@SpringBootApplication
public class Springboot02BaseConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02BaseConfigApplication.class, args);
    }

}
