package com.tqy.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/7/5.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "test1";
    }


}
