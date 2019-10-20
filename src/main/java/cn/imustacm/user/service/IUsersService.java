package cn.imustacm.user.service;

import cn.imustacm.common.domain.Resp;
import cn.imustacm.user.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户服务接口定义
 *
 * @author liandong
 * @since 2019-07-21
 */
@RequestMapping("/api/users")
public interface IUsersService {

    /**
     * 分页查询用户信息 (测试框架)
     *
     * @return
     */
    @GetMapping("/list")
    Resp getUserList(@RequestParam("pageIndex") Integer pageIndex, @RequestParam("pageSize") Integer pageSize);

    /**
     * 根据用户Id查询用户信息
     *
     * @param userId
     * @return
     */
    @GetMapping("get")
    Users getUser(@RequestParam("id") Long userId);


}
