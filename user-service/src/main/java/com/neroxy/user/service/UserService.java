package com.neroxy.user.service;

import com.neroxy.user.mapper.UserMapper;
import com.neroxy.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findOne(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
