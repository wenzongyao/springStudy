package com.springstudy.demo.module.login.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springstudy.demo.module.login.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
