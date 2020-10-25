package com.deng.mybatis;

import com.deng.mybatis.entity.User;
import com.deng.mybatis.mapper.UserMapper;
import com.deng.mybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MybatisApplicationTests {

    @Autowired
    UserMapper mapper;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User userById = mapper.getUserById(1L);
        System.out.println(userById);
    }

    @Test
    void contextLoads1() {
        User userById = userService.getUserById(1L);
        System.out.println(userById);
    }

}
