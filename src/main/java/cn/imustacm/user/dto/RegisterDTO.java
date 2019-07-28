package cn.imustacm.user.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 用户注册DTO
 *
 * @author liandong
 * Date: 2019/07/27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @NotNull(message = "密码不能为空")
    private String password;

    /**
     * 重复密码
     */
    @NotNull(message = "重复密码不能为空")
    private String rePassword;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 验证码key
     */
    private String captchaKey;

    /**
     * 验证码
     */
    private String captchaValue;

}
