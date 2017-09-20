package com.rabbit.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rabbit.ssm.dao.mybatis.AppDAO;
import com.rabbit.ssm.domain.model.mybatis.AppDO;
import com.rabbit.ssm.service.AppService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager = "tm4mybatis")
public class AppServiceImpl extends ServiceImpl<AppDAO, AppDO> implements AppService {
}
