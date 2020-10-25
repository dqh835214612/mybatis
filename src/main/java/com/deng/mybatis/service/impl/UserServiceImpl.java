package com.deng.mybatis.service.impl;

import com.deng.mybatis.entity.User;
import com.deng.mybatis.mapper.UserMapper;
import com.deng.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
