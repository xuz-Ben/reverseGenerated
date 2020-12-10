package com.reverseGenerated.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据源返回
 * @Author xuz_Ben
 * @Date 2020/12/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataSurceDto {

  private String dataType;

  private Integer dataSourceId;
}
