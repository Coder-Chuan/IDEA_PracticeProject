package com.yuechuan.service.impl;

import com.yuechuan.dao.UserMapper;
import com.yuechuan.domain.User;
import com.yuechuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
