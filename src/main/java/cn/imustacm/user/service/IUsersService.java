package cn.imustacm.user.service;

import cn.imustacm.common.domain.Resp;
import cn.imustacm.user.dto.BindEmailDTO;
import cn.imustacm.user.dto.LoginDTO;
import cn.imustacm.user.dto.RegisterDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户服务接口定义
 *
 * @author liandong
 * @since 2019-07-21
 */
@RequestMapping("/api/users")
public interface IUsersService {

    /**
     * 获取验证码
     *
     * @return
     */
    @GetMapping("/getVerification")
    Resp getVerification();

    /**
     * 用户注册
     *
     * @return
     */
    @PostMapping("/register")
    Resp register(@RequestBody RegisterDTO registerDTO);

    /**
     * 用户登录
     *
     * @return
     */
    @PostMapping("/login")
    Resp login(HttpServletResponse response, @RequestBody LoginDTO loginDTO);

    /**
     * 邮箱绑定
     *
     * @return
     */
    @PostMapping("/bindEmail")
    Resp bindEmail(HttpServletRequest request, @RequestBody BindEmailDTO bindEmailDTO);

    /**
     * 邮箱验证
     *
     * @return
     */
    @GetMapping("/verifyEmail")
    Resp verifyEmail(@RequestParam String id);

    /**
     * 分页查询用户信息
     *
     * @return
     */
    @GetMapping("/list")
    Resp getUserList(@RequestParam("pageIndex") Integer pageIndex, @RequestParam("pageSize") Integer pageSize);

}
