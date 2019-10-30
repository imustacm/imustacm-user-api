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

    /**
     * 用户名
     */
    private String username;

    /**
     * 姓名
     */
    private String realname;

    /**
     * 学校
     */
    private String signature;

    private Integer gender;

    private String school;

    private String major;

    private String grade;

    private String avatar;

    private Integer submit;

    private Integer solved;
}
