package cn.imustacm.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 验证码DTO
 *
 * @author liandong
 * Date: 2019/07/27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginInfoDTO {
    /**
     * 用户角色
     */
    private  String[] permissions;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户头像
     */
    private String avatar;
}
