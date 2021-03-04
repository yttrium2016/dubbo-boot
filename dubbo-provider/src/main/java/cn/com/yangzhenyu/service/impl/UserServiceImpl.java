package cn.com.yangzhenyu.service.impl;

import cn.com.yangzhenyu.bean.UserVo;
import cn.com.yangzhenyu.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements IUserService {
    @Override
    public UserVo findUser() {
        UserVo userVo = new UserVo();
        userVo.setId(1);
        userVo.setAddress("shanghai");
        userVo.setName("yzy");
        return userVo;
    }
}
