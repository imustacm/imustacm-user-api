package cn.imustacm.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 用户权限DTO
 *
 * @author liandong
 * Date: 2019/07/27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPermissionDTO {

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空")
    private Integer userId;

    /**
     * 权限id
     */
    @NotNull(message = "权限id不能为null")
    private Integer permissionId;

}
