package cn.imustacm.user;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 用户相关呢接口定义
 *
 * @author liandong
 * @since 2019-07-21
 */
@RequestMapping("/api/user")
public interface IUsersService {


    /**
     * 测试一下
     *
     * @return
     */
    @PostMapping("/register")
    Boolean register();

    @GetMapping("/getVerification")
    JSONObject getVerification();

}
