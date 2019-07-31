package cn.imustacm.user.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 用户登录返回DTO
 *
 * @author wangjianli
 * Date: 2019/07/31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginOutDTO {

    /**
     * token
     */
    private String token;

    /**
     * 登录时间
     */
    private String logintime;

}
