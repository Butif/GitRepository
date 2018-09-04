package com.butif.funck.controllerDemo;

import com.butif.funck.pojo.Orders;
import com.butif.funck.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ljh
 * @version 1.0
 * @description com.butif.funck.controllerDemo
 * @date 2018/9/3
 * @user Butif
 */
@Controller
public class FreeMarkerController {


    @Autowired
    private TestService testService;

    @RequestMapping("/orders/list")
    @ResponseBody
    public List<Orders> getOrdersList(){
        return testService.getOrdersList();
    }


}
