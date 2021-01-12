package cn.imustacm.user.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * 权限关联接口集合DTO
 *
 * @author liandong
 * Date: 2019/07/27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PermissionInterfaceDTO {

    /**
     * 权限id
     */
    @NotNull
    private Integer permissionId;

    /**
     * 接口id list
     */
    @NotNull
    @Size(min = 1)
    private List<Integer> interfaceIdList;
}
