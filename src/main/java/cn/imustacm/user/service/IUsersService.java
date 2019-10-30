package cn.imustacm.user.service;

import cn.imustacm.common.domain.Resp;
import cn.imustacm.user.dto.RankListDTO;
import cn.imustacm.user.model.Option;
import cn.imustacm.user.model.Users;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
     *  @param pageIndex
     *  @param pageSize
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

    /**
     * 根据key查询配置信息
     *
     * @param key
     * @return
     */
    @GetMapping("/getByKey")
    Option getByKey(@RequestParam("key") String key);

    /**
     * 分页获取解题排名
     *
     *  @param pageIndex
     *  @param pageSize
     * @return
     */
    @GetMapping("/getRankList")
    Page<RankListDTO> getRankList(@RequestParam("pageIndex") Integer pageIndex, @RequestParam("pageSize") Integer pageSize);

}
