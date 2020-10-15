package com.jl.avp.controller;

import com.github.pagehelper.PageInfo;
import com.jl.avp.model.generator.User;
import com.jl.avp.service.UserService;
import com.tceasy.common.base.exception.bean.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("queryList")
    public Map queryList(@RequestParam(defaultValue = "1", required = false) Integer page, @RequestParam(defaultValue = "1", required = false) Integer pageSize){
        PageInfo<User> userPageInfo = userService.queryList(page, pageSize);
        return ResponseBean.SUCCESS().put("info", userPageInfo).getResult();
    }
}
