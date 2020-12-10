package com.reverseGenerated.service;

import com.reverseGenerated.pojo.dto.DataSurceDto;
import java.util.List;

public interface DataSurceService {

  /**
   * 获取所有的数据源信息
   * @return
   */
  List<DataSurceDto> getAllDataSource();
}