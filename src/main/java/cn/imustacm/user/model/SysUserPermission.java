package cn.imustacm.user.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author liandong
 * @since 2020-12-27
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user_permission")
public class SysUserPermission extends Model<SysUserPermission> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @TableField("create_time")
    private Date createTime;

    @TableField("create_user")
    private Integer createUser;

    @TableField("user_id")
    private Integer userId;

    @TableField("role_id")
    private Integer roleId;

    @TableField("update_time")
    private Date updateTime;

    @TableField("update_user")
    private Integer updateUser;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
