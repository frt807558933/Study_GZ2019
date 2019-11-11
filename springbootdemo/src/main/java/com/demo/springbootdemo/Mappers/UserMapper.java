package com.demo.springbootdemo.Mappers;

import com.demo.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> getUserList(); 
}
