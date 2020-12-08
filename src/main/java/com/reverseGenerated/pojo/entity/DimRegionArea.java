package com.reverseGenerated.pojo.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.TableName;
    import java.io.Serializable;
    import javax.validation.constraints.Null;
    import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.NoArgsConstructor;
/**
 * DimRegionArea对象
 *
 * @author xuz_Ben
 * @since 2020-12-08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("p_dim_region_area")
public class DimRegionArea implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
    * 
     *
    **/
    @TableField("id")
    private Integer id;

    /**
    * 上级区域代码
     *
    **/
    @TableField("parent_region_code")
    private String parentRegionCode;

    /**
    * 上级区域名称
     *
    **/
    @TableField("parent_region_name")
    private String parentRegionName;

    /**
    * 区域代码
     *
    **/
    @TableField("region_code")
    private String regionCode;

    /**
    * 社区名称
     *
    **/
    @TableField("region_name")
    private String regionName;

    /**
    * 社区面积
     *
    **/
    @TableField("region_area")
    private BigDecimal regionArea;


}