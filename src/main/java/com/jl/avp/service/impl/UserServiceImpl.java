package com.jl.avp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jl.avp.dao.generator.UserMapper;
import com.jl.avp.model.generator.User;
import com.jl.avp.model.generator.UserExample;
import com.jl.avp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo<User> queryList(Integer page,Integer pageSize) {
        UserExample userExample = new UserExample();
        PageHelper.startPage(page, pageSize);
        List<User> users = userMapper.selectByExample(userExample);
        return new PageInfo<>(users);
    }
}
