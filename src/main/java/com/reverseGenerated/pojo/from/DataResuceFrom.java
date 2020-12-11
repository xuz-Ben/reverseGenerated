package com.reverseGenerated.pojo.from;

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
public class DataResuceFrom {

  private Integer id;

  private Long dataResuceId;

  private String ip;

  private String port;

  private String databaseName;

  private String account;

  private String password;

  private Long userid;
}
