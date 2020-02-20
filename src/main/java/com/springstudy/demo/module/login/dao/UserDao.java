package com.springstudy.demo.module.login.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springstudy.demo.module.login.entity.bo.UserBO;
import com.springstudy.demo.module.login.entity.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao extends BaseMapper<UserPO> {

    UserBO findByAccount(@Param("account") String account);
}
