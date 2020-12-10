package com.reverseGenerated.pojo.entity.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xuz_Ben
 * @Date 2020/12/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId
  private Integer id;

  @TableField("create_time")
  private Date createTime;

  @TableField("create_by")
  private String createBy;

  @TableField("update_time")
  private Date updateTime;

  @TableField("update_by")
  private String updateBy;

}
