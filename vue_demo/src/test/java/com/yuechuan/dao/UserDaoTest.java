package com.yuechuan.dao;

import com.yuechuan.SpringBootVue_DemoStarter;
import com.yuechuan.domain.User;
import com.yuechuan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootVue_DemoStarter.class)
public class UserDaoTest {
    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        userService.findAll()
        .forEach(u-> System.out.println(u));
    }
}
