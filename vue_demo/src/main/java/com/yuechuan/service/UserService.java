package com.yuechuan.service;

import com.yuechuan.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User findById(String id);

    public void update(User user);
}
