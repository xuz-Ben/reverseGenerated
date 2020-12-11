package com.reverseGenerated.constant;

import com.baomidou.mybatisplus.extension.api.IErrorCode;

public enum ErrorCodeEx implements IErrorCode {
  SUCCESS(200, "SUCCESS"),
  //TODO: 返回code和消息在这里添加
  SERVER_ERROR(500, "服务器内部错误"),

  /**************xuz_Ben 数据源错误   *********/
  FROM_NULL(100100101, "请求参数为空"),
  IP_NULL(100100102, "ip不能为空，请先填写ip"),
  PORT_NULL(100100103, "端口不能为空，请先填写端口"),
  DATABASENAME_NULL(100100104, "数据库名称不能为空, 请先填写数据库名称"),
  ACCOUNT_NULL(100100105, "账号不能为空，请先填写账号"),
  DATA_EXIST(100100106, "数据源已存在！！");

  private final Integer code;
  private final String msg;

  ErrorCodeEx(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public long getCode() {
    return code;
  }

  @Override
  public String getMsg() {
    return msg;
  }
}
