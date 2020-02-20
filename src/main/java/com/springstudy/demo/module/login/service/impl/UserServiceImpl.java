package com.springstudy.demo.module.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springstudy.demo.common.Ret;
import com.springstudy.demo.module.login.dao.UserDao;
import com.springstudy.demo.module.login.entity.bo.UserBO;
import com.springstudy.demo.module.login.entity.po.UserPO;
import com.springstudy.demo.module.login.entity.vo.LoginVO;
import com.springstudy.demo.module.login.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserPO> implements UserService {

    @Override
    public Ret<UserBO> login(LoginVO loginVO) {

        UserBO userBO = this.baseMapper.findByAccount(loginVO.getAccount());
        if (userBO == null){
            return Ret.fail("账号不存在");
        }

        if (!userBO.getPassword().equals(loginVO.getPassword())){
            return Ret.fail("密码不正确");
        }


        return Ret.success(userBO);
    }

}
