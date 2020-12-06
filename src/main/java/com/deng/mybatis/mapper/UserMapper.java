package com.deng.mybatis.mapper;

import com.deng.mybatis.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper  {

    User getUserById (Long id);

    List<User> getUserAll();
}
