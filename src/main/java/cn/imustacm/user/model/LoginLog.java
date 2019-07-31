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
 * 登录日志
 *
 * @author wangjianli
 * @since 2019-07-31
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("login_log")
public class LoginLog extends Model<LoginLog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userid;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime createtime;

    private String ip;

    private boolean visible;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
