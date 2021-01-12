package cn.imustacm.user.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
@TableName("sys_permission_interface")
public class SysPermissionInterface extends Model<SysPermissionInterface> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer permissionId;

    private Integer interfaceId;

    /**
     * 接口路径
     */
    private String interfaceUrl;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
