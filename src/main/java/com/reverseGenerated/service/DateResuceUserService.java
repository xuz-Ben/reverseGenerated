package com.reverseGenerated.service;

import com.reverseGenerated.pojo.dto.DataResuceUserDto;
import com.reverseGenerated.pojo.from.DataResuceFrom;
import java.util.List;

public interface DateResuceUserService {

  /**
   * 添加数据源信息
   * @param from
   */
  void addDataResuceData(DataResuceFrom from);

  /**
   * 获取这个数据类型下面的所有数据源
   * @param user 用户id
   * @param dataResuceId 数据类型id
   * @return
   */
  List<DataResuceUserDto> getAllDataResuceUser(Long user, Long dataResuceId);
}