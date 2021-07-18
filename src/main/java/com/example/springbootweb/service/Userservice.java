package com.example.springbootweb.service;

import com.example.springbootweb.mapper.UserMapper;
import com.example.springbootweb.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Userservice {
    @Autowired
    private UserMapper userMapper;

    public user queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<user> queryUsers(){
        return this.userMapper.selectAll();
    }

    @Transactional
    public void deleteUserById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }


}
