package cn.imustacm.user.model;

import cn.imustacm.common.utils.LocalDateTimeJsonDeserializer;
import cn.imustacm.common.utils.LocalDateTimeJsonSerializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * 用户信息
 *
 * @author liandong
 * @since 2019-07-21
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("users")
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String signature;

    private Integer gender;

    private String email;

    private String school;

    private String major;

    private String grade;

    private String avatar;

    private String blog;

    private String github;

    private String qq;

    private String qqopenid;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime qqtime;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime regtime;

    private String regip;

    private Integer submit;

    private Integer solved;

    private Integer page;

    private Integer language;

    private Integer subject;

    private boolean visible;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime emaicltime;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime emailutime;

    private boolean emailflag;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
