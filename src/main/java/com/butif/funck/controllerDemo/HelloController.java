package com.butif.funck.controllerDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljh
 * @version 1.0
 * @description com.butif
 * @date 2018/9/3
 * @user Butif
 * 这里的@RestController 相当于@ResponseBody + @Controller
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloSpringBoot(){
        return "Hello fuck SpringBoot";
    }


}
