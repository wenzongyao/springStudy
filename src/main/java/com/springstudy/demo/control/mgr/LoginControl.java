package com.springstudy.demo.control.mgr;

import com.springstudy.demo.common.Ret;
import com.springstudy.demo.module.login.entity.bo.UserBO;
import com.springstudy.demo.module.login.entity.vo.LoginVO;
import com.springstudy.demo.module.login.entity.vo.UserVO;
import com.springstudy.demo.module.login.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public Ret login(LoginVO loginVO) {
        if (StringUtils.isEmpty(loginVO.getAccount())){
            return Ret.fail("请输入账号");
        }

        Ret<UserBO> ret = userService.login(loginVO);
        if (ret.isFail()){
            return ret;
        }

        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(ret.getData(), userVO);
        return Ret.success(userVO);
    }

    @RequestMapping(value = "/userInfo")
    public String userInfo(String account) {

        return "";
    }
}
