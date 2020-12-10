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
 * DataSurce对象
 *
 * @author xuz_Ben
 * @since 2020-12-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("p_data_surce")
public class DataSurce extends BaseEntity {


    /**
    * 数据源类型
     *
    **/
    @TableField("data_type")
    private String dataType;

    /**
    * 数据源名称
     *
    **/
    @TableField("data_name")
    private String dataName;

    /**
    * 对应的驱动类
     *
    **/
    @TableField("dirver_calss_name")
    private String dirverCalssName;


}