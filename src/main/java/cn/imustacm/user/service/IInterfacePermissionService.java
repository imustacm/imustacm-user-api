package cn.imustacm.user.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * 接口权限
 *
 * @author liandong
 * @since 2019-07-21
 */
@RequestMapping("/api/interface/permission")
public interface IInterfacePermissionService {

    /**
     * 查询接口对应的权限set
     *
     * @param servletPath
     * @return
     */
    @GetMapping("get")
    Set getInterfacePermissionSet(@RequestParam("servletPath") String servletPath);

}
