package cn.imustacm.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

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
public class CaptchaOutDTO {
    /**
     * 验证码key
     */
    private String key;

    /**
     * 验证码value
     */
    private byte[] value;
}
