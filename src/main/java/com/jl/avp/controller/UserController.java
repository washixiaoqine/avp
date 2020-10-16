package com.jl.avp.controller;

import com.github.pagehelper.PageInfo;
import com.jl.avp.model.generator.User;
import com.jl.avp.service.UserService;
import com.tceasy.common.base.exception.bean.ResponseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("user")
@RestController
@Api(tags = "用户管理相关接口")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("queryList")
    @ApiOperation("查询用户列表接口")
    public Map queryList(@RequestParam(defaultValue = "1", required = false) Integer page, @RequestParam(defaultValue = "1", required = false) Integer pageSize){
        PageInfo<User> userPageInfo = userService.queryList(page, pageSize);
        return ResponseBean.SUCCESS().put("info", userPageInfo).getResult();
    }
}
