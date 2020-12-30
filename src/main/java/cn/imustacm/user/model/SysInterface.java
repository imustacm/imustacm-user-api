package cn.imustacm.user.model;

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
@TableName("sys_interface")
public class SysInterface extends Model<SysInterface> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String serviceName;

    private String interfaceUrl;

    private String description;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
