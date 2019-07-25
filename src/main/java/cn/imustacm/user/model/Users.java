package cn.imustacm.user.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * <p>
 * 
 * </p>
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

//    private String password;
//
//    @TableField("realName")
//    private String realName;
//
//    private String signature;

    private Integer gender;

//    private String email;
//
//    private String school;
//
//    private String professional;
//
//    private String grade;
//
//    private String head;
//
//    private String qq;
//
//    @TableField("qqOpenId")
//    private String qqOpenId;
//
//    @TableField("qqTime")
//    private LocalDateTime qqTime;
//
//    private Integer submit;
//
//    private Integer solved;
//
//    @TableField("regTime")
//    private LocalDateTime regTime;
//
//    private Integer volume;
//
//    private Integer language;
//
//    private Integer subject;
//
//    private String defunct;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
