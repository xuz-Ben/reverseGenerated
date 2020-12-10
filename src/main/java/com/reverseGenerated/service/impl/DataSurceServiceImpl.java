package com.reverseGenerated.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.reverseGenerated.pojo.dto.DataSurceDto;
import com.reverseGenerated.pojo.entity.DataSurce;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.reverseGenerated.service.DataSurceService;
import com.reverseGenerated.mapper.DataSurceMapper;

/**
 * DataSurce业务处理类
 *
 * @author xuz_Ben
 * @since 2020-12-10
 * */
@Service
public class DataSurceServiceImpl implements DataSurceService {

  @Resource
  private DataSurceMapper mapper;

  @Override
  public List<DataSurceDto> getAllDataSource() {
    QueryWrapper<DataSurce> wrapper = new QueryWrapper<>();
    List<DataSurce> dataSurcesList = mapper.selectList(wrapper);
    return dataSurcesList.stream().map(dataSurce -> {
      return DataSurceDto.builder().dataSourceId(dataSurce.getId())
          .dataType(dataSurce.getDataType()).build();
    }).collect(Collectors.toList());
  }
}