package com.reverseGenerated.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xuz_Ben
 * @Date 2020/11/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

  //返回表示404、500、200等
  private Long code;

  //返回前端的消息
  private String messages;

  //数据
  private T data;

  public CommonResult(Long code, String messages) {
    this(code, messages, null);
  }

  public CommonResult(T data) {
    this(200L, "SUCCESS", data);
  }
}
