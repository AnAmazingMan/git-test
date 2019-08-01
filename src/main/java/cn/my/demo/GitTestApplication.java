package cn.my.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: xinziqiang
 * @date: 2019/8/1
 * @description:
 */
@SpringBootApplication
public class GitTestApplication {
    public static void main(String[] args){
        System.out.println("hello world!!!");
        SpringApplication.run(GitTestApplication.class,args);
    }
}
