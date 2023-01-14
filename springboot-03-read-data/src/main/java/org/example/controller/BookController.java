package org.example.controller;

import org.example.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    /**
     * 读取yaml单个属性
     */
    @Value("${lesson}")
    private String lesson;

    /**
     * 读取yaml多级属性
     */
    @Value("${server.port}")
    private Integer port;

    /**
     * 读取yaml数组元素
     */
    @Value("${enterprise.subject[0]}")
    private String subject_0;

    /**
     * 将配置文件中的所有属性加载到environment
     */
    @Autowired
    private Environment environment;

    /**
     * 实体类读取
     */
    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("lesson ---> " + lesson);
        System.out.println("port ---> " + port);
        System.out.println("subject_0 ---> " + subject_0);
        System.out.println();
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.age"));
        System.out.println();
        System.out.println(enterprise);
        return "hello spring boot";
    }
}
