package cn.com.yangzhenyu.comtroller;

import cn.com.yangzhenyu.bean.UserVo;
import cn.com.yangzhenyu.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @DubboReference
    private IUserService userService;

    @RequestMapping("test")
    public UserVo test(){
        return userService.findUser();
    }
}
