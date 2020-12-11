package com.reverseGenerated.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xuz_Ben
 * @Date 2020/12/11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataResuceUserDto {

  private Integer id;

  private Long dataResuceId;

  private String ip;

  private String port;

  private String account;

  private String password;

  private String databaseName;

  private Long userid;

  private String createDate;

  private String updateDate;
}
