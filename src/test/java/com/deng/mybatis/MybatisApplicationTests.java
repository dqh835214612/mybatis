package com.deng.mybatis;

import com.deng.mybatis.entity.User;
import com.deng.mybatis.mapper.UserMapper;
import com.deng.mybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.*;

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
    void getUserAll() {

        List<User> list = mapper.getUserAll();
        Map<String, List<Object>> map = new HashMap<>();
        System.err.println(list);
        for (User user : list) {
// map是否包含此key，若已经包含则添加一个新的数字到对应value集合中
            if (map.containsKey(user.getName())) {
                map.get(user.getName()).add(user.getAge());
            } else {
                List<Object> newList = new ArrayList<>();
                newList.add(user.getAge());
                map.put(user.getName(), newList);
            }
        }
        System.out.println(map);

        for (Map.Entry<String, List<Object>> entry : map.entrySet()) {
                System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
               }
    }

    @Test
    void contextLoads1() {
        User userById = userService.getUserById(1L);
        System.out.println(userById);
    }
    @Test
    void getDate() {
        List<User> list = mapper.getUserAll();
        Set<String> set=new HashSet();
        for (User user:list) {
            set.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(user.getCreateTime()));
        }
        System.out.println(set);
    }

}
