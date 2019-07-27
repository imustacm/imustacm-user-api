package cn.imustacm.user;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 用户相关的接口定义
 *
 * @author liandong
 * @since 2019-07-21
 */
@RequestMapping("/api/user")
public interface IUsersService {

    /**
     * 用户注册
     * @return
     */
    @PostMapping("/register")
    JSONObject register();

    /**
     * 获取验证码
     * @return
     */
    @GetMapping("/getVerification")
    JSONObject getVerification();

}
