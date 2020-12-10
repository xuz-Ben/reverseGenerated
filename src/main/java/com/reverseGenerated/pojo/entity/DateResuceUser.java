package com.reverseGenerated.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.io.Serializable;
import javax.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.NoArgsConstructor;
import com.reverseGenerated.pojo.entity.base.BaseEntity;
/**
 * DateResuceUser对象
 *
 * @author xuz_Ben
 * @since 2020-12-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("p_date_resuce_user")
public class DateResuceUser extends BaseEntity {


    /**
     * data_resuce_id
     *
     **/
    @TableField("data_resuce_id")
    private Long dataResuceId;

    /**
     * ip
     *
     **/
    @TableField("ip")
    private String ip;

    /**
     * 端口
     *
     **/
    @TableField("port")
    private String port;

    /**
     * 账号
     *
     **/
    @TableField("account")
    private String account;

    /**
     * 密码
     *
     **/
    @TableField("password")
    private String password;

    /**
     * 用户id
     *
     **/
    @TableField("userid")
    private Long userid;

}