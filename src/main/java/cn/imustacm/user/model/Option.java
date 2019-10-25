package cn.imustacm.user.model;

import cn.imustacm.common.utils.LocalDateTimeJsonDeserializer;
import cn.imustacm.common.utils.LocalDateTimeJsonSerializable;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * 系统配置
 *
 * @author wangjianli
 * @since 2019-10-24
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("option")
public class Option extends Model<Option> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String key;

    private String value;

    private String meaning;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
