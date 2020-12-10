package com.reverseGenerated.service.impl;

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
}