package com.reverseGenerated.controller;

import io.swagger.annotations.Api;
import javax.annotation.Resource;
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
}