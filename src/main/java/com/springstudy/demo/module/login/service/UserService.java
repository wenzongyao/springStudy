package com.springstudy.demo.module.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springstudy.demo.common.Ret;
import com.springstudy.demo.module.login.entity.bo.UserBO;
import com.springstudy.demo.module.login.entity.po.UserPO;
import com.springstudy.demo.module.login.entity.vo.LoginVO;

public interface UserService extends IService<UserPO> {
    Ret<UserBO> login(LoginVO loginVO);
}
