package com.springstudy.demo.module.login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springstudy.demo.module.login.dao.UserDao;
import com.springstudy.demo.module.login.entity.UserEntity;
import com.springstudy.demo.module.login.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public UserEntity findByAccount(String account) {
        return this.baseMapper.selectOne(new QueryWrapper<UserEntity>()
                .eq("account", account)
                .or((c) -> c.eq("age", 11).or().eq("age", 10))
        );
    }
}
