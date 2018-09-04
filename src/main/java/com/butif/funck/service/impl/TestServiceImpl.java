package com.butif.funck.service.impl;

import com.butif.funck.mapper.OrdersMapper;
import com.butif.funck.pojo.Orders;
import com.butif.funck.service.TestService;

import com.github.pagehelper.PageHelper;
import javafx.scene.shape.ShapeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ljh
 * @version 1.0
 * @description com.butif.funck.service.impl
 * @date 2018/9/3
 * @user Butif
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> getOrdersList() {
        PageHelper.startPage(1,2);//设置分页

        List<Orders> select = ordersMapper.select(null);


        for (Orders orders : select) {
            System.out.println(orders.getId());
        }
        return select;
    }
}
