package cn.my.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xinziqiang
 * @date: 2019/8/1
 * @description:
 */
@RestController
@RequestMapping("/helloworld")
public class HelloWorld {
    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello world!!!";
    }
}
