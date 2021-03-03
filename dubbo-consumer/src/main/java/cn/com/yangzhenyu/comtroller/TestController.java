package cn.com.yangzhenyu.comtroller;

import cn.com.yangzhenyu.bean.UserVo;
import cn.com.yangzhenyu.service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @DubboReference
    private IUserService userService;

    @RequestMapping("g")
    public UserVo get(){
        return userService.findUser();
    }
}
