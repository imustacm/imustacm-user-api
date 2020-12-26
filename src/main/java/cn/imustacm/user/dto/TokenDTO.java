package cn.imustacm.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class TokenDTO {
    /**
     * Token key
     */
    private String accessToken;

}
