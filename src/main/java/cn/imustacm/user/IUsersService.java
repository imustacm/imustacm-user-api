package cn.imustacm.user;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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

}
