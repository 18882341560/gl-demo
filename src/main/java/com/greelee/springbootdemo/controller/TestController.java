package com.greelee.springbootdemo.controller;

import com.greelee.gllog.anno.Action;
import com.greelee.gllog.constant.ActionLogEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: gl
 * @Email: 110.com
 * @version: 1.0
 * @Date: 2019/3/16
 * @describe:
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/t1")
    @Action(type = ActionLogEnum.UPDATE,describe = "测试01")
    public String test1(String name){
        System.out.println(name);
        return name;
    }


    @RequestMapping("/t2")
    @Action(type = ActionLogEnum.UPDATE,describe = "测试02")
    public String test2(String name){
        int a = 1/0;
        return name;
    }


}
