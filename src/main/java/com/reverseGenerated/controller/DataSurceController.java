package com.reverseGenerated.controller;

import com.reverseGenerated.pojo.dto.DataSurceDto;
import io.swagger.annotations.Api;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reverseGenerated.service.DataSurceService;

/**
* DataSurce接口类
 *
 * @author xuz_Ben
 * @since 2020-12-10
*/
@Api(tags = "数据原表")
@RestController
@RequestMapping("DataSurce")
public class DataSurceController {

  @Resource
  private DataSurceService service;

  @GetMapping("/v1/getAllDataSource")
  public List<DataSurceDto> getAllDataSource(){
    return service.getAllDataSource();
  }
}