package com.reverseGenerated.controller;

import com.reverseGenerated.pojo.dto.CommonResult;
import com.reverseGenerated.pojo.from.DataResuceFrom;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reverseGenerated.service.DateResuceUserService;

/**
* DateResuceUser接口类
 *
 * @author xuz_Ben
 * @since 2020-12-10
*/
@Api(tags = "用户创建数据源")
@RestController
@RequestMapping("DateResuceUser")
public class DateResuceUserController {

  @Resource
  private DateResuceUserService service;

  /**
   * 创建数据源
   * @param from
   */
  @PostMapping("/v1/addDataResuceData")
  public void addDataResuceData(@RequestBody DataResuceFrom from) {
    service.addDataResuceData(from);
  }

  /**
   * 获取数据源列表
   * @param from
   * @return
   */
  @PostMapping("/v1/getAllDataResuceUser")
  public CommonResult<Object> getAllDataResuceUser(@RequestBody DataResuceFrom from) {
    return new CommonResult(service.getAllDataResuceUser(from.getUserid(), from.getDataResuceId()));
  }
}