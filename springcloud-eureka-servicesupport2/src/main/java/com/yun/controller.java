package com.yun;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName controller
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/12/28 10:40 下午
 * @Version 1.0
 **/

@RestController
@RequestMapping("/Hello")
class Controller {
    @RequestMapping("/World")
    public String helloWorld(String s){
        System.out.println("传入的值为："+s);
        return "传入的值为："+s;
    }
}