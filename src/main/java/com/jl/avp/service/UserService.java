package com.jl.avp.service;

import com.github.pagehelper.PageInfo;
import com.jl.avp.model.generator.User;

public interface UserService {
    PageInfo<User> queryList(Integer page, Integer pageSize);

}
