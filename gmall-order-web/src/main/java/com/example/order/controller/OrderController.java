package com.example.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.example.bean.UserAddress;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

	@Reference
	UserService userservice;

	@GetMapping
    @ResponseBody
    public String trade(@RequestParam("userId")String userId){
        List<UserAddress> userAddressList = userservice.getUserAddressList(userId);
        String jsonString = JSON.toJSONString(userAddressList);
        return jsonString;
    }
}
