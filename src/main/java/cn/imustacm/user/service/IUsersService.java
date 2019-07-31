package cn.imustacm.user.service;

import cn.imustacm.common.domain.Resp;
import cn.imustacm.user.dto.LoginDTO;
import cn.imustacm.user.dto.RegisterDTO;
import org.springframework.web.bind.annotation.*;

/**
 * 用户相关的接口定义
 *
 * @author liandong
 * @since 2019-07-21
 */
@RequestMapping("/api/user")
public interface IUsersService {

    /**
     * 用户注册
     *
     * @return
     */
    @PostMapping("/register")
    Resp register(@RequestBody RegisterDTO registerDTO);

    /**
     * 获取验证码
     *
     * @return
     */
    @GetMapping("/getVerification")
    Resp getVerification();

    /**
     * 分页查询用户信息
     *
     * @return
     */
    @GetMapping("/list")
    Resp getUserList(@RequestParam("pageIndex") Integer pageIndex,
                     @RequestParam("pageSize") Integer pageSize);

    /**
     * 用户登录
     *
     * @return
     */
    @PostMapping("/login")
    Resp login(@RequestBody LoginDTO loginDTO);

}
