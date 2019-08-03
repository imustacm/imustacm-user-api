package cn.imustacm.user.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 绑定EmailDTO
 *
 * @author wangjianli
 * Date: 2019/07/31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BindEmailDTO {

    /**
     * Email
     */
    private String email;

}
