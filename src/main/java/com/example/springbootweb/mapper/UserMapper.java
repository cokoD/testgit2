package com.example.springbootweb.mapper;

import com.example.springbootweb.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<user> {

}
