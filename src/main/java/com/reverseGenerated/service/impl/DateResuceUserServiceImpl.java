package com.reverseGenerated.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.reverseGenerated.constant.ErrorCodeEx;
import com.reverseGenerated.exception.ReverseGeneratedApplicationException;
import com.reverseGenerated.pojo.dto.DataResuceUserDto;
import com.reverseGenerated.pojo.entity.DateResuceUser;
import com.reverseGenerated.pojo.from.DataResuceFrom;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.reverseGenerated.service.DateResuceUserService;
import com.reverseGenerated.mapper.DateResuceUserMapper;

/**
 * DateResuceUser业务处理类
 *
 * @author xuz_Ben
 * @since 2020-12-10
 * */
@Service
public class DateResuceUserServiceImpl implements DateResuceUserService {

  @Resource
  private DateResuceUserMapper mapper;

  @Override
  public void addDataResuceData(DataResuceFrom from) {
    //查询是否已经存在这个数据源
    if(from == null) {
      throw new ReverseGeneratedApplicationException(ErrorCodeEx.FROM_NULL.getCode(), ErrorCodeEx.FROM_NULL.getMsg());
    }
    if(StringUtils.isBlank(from.getAccount())) {
      throw new ReverseGeneratedApplicationException(ErrorCodeEx.ACCOUNT_NULL.getCode(), ErrorCodeEx.ACCOUNT_NULL.getMsg());
    }
    if(StringUtils.isBlank(from.getIp())) {
      throw new ReverseGeneratedApplicationException(ErrorCodeEx.IP_NULL.getCode(), ErrorCodeEx.IP_NULL.getMsg());
    }
    if(StringUtils.isBlank(from.getDatabaseName())) {
      throw new ReverseGeneratedApplicationException(ErrorCodeEx.DATABASENAME_NULL.getCode(), ErrorCodeEx.DATABASENAME_NULL.getMsg());
    }
    if(StringUtils.isBlank(from.getPort())) {
      throw new ReverseGeneratedApplicationException(ErrorCodeEx.PORT_NULL.getCode(), ErrorCodeEx.PORT_NULL.getMsg());
    }
    /////开始判断是否存在这个数据源
    QueryWrapper<DateResuceUser> wrapper = new QueryWrapper<>();
    wrapper.lambda().eq(DateResuceUser::getIp, from.getIp()).eq(DateResuceUser::getPort, from.getPort())
        .eq(DateResuceUser::getAccount, from.getAccount())
        .eq(DateResuceUser::getDatabaseName, from.getDatabaseName());
    DateResuceUser dateResuceUser = mapper.selectOne(wrapper);
    if (dateResuceUser == null) {
      //开始创建
      DateResuceUser dateResuce = DateResuceUser.builder().dataResuceId(from.getDataResuceId())
          .account(from.getAccount())
          .databaseName(from.getDatabaseName())
          .ip(from.getIp())
          .password(from.getPassword())
          .port(from.getPort())
          .userid(from.getUserid())
          .build();
      mapper.insert(dateResuce);
    } else{
      throw  new ReverseGeneratedApplicationException(ErrorCodeEx.DATA_EXIST.getCode(), ErrorCodeEx.DATA_EXIST.getMsg());
    }
  }

  @Override
  public List<DataResuceUserDto> getAllDataResuceUser(String user, String dataResuceId) {
    QueryWrapper<DateResuceUser> wrapper = new QueryWrapper<>();
    wrapper.lambda().eq(DateResuceUser::getUserid, user).eq(DateResuceUser::getDataResuceId, dataResuceId);
    List<DateResuceUser> dateResuceUserList = mapper.selectList(wrapper);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    return dateResuceUserList.stream().map(dateResuceUser -> {
      return DataResuceUserDto.builder()
          .id(dateResuceUser.getId())
          .account(dateResuceUser.getAccount())
          .createDate(sdf.format(dateResuceUser.getCreateTime()))
          .dataResuceId(dateResuceUser.getDataResuceId())
          .ip(dateResuceUser.getIp())
          .password(dateResuceUser.getPassword())
          .port(dateResuceUser.getPort())
          .updateDate(sdf.format(dateResuceUser.getUpdateTime()))
          .databaseName(dateResuceUser.getDatabaseName())
          .userid(dateResuceUser.getUserid())
          .build();
    }).collect(Collectors.toList());
  }
}