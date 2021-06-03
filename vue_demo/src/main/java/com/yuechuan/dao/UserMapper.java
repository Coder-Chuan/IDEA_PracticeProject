package com.yuechuan.dao;

import com.yuechuan.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/* private Integer id;
    private Integer age;
    private String username;
    private String password;
    private String email;
    private String sex;*/

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id = #{id}")
    public User findById(String id);

    @Update("update user set age = #{age},username = #{username},password = #{password},email = #{email},sex = #{sex} where id = #{id}")
    public void update(User user);
}
