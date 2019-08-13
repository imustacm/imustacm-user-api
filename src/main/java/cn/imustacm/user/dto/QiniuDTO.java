package cn.imustacm.user.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 七牛云TokenDTO
 *
 * @author wangjianli
 * Date: 2019/08/13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QiniuDTO {

    /**
     * 七牛云Token
     */
    private String token;

}
