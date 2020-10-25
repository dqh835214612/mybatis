package com.deng.mybatis.entity;

import lombok.Data;

@Data
public class User extends BaseUser{

    Long id;
    String name;
    Integer age;
}
