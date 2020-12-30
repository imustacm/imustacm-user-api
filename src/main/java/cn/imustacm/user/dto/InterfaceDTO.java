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
public class InterfaceDTO {

    private Integer id;

    @NotNull
    private String serviceName;

    @NotNull
    private String interfaceUrl;

    private String description;

    @NotNull
    private Boolean visible;

}
