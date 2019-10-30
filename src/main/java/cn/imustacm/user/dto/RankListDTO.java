package cn.imustacm.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 解题排名DTO
 *
 * @author wangjianli
 * Date: 2019/10/30
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RankListDTO {

    private String username;

    private String realname;

    private String signature;

    private Integer gender;

    private String school;

    private String major;

    private String grade;

    private String avatar;

    private Integer submit;

    private Integer solved;

}
