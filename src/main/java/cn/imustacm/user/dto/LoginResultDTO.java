package cn.imustacm.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Token DTO
 *
 * @author Wangjianli
 * Date: 2020/12/24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResultDTO {

    /**
     * Token key
     */
    private String accessToken;

    /**
     * 用户权限名称List
     */
    private List<String> permissionNameList;

}
