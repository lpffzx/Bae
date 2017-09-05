package com.rabbit.ssm.dao.lifepay;

import com.rabbit.ssm.domain.model.lifepay.LifePayBillDO;
import org.springframework.stereotype.Component;

@Component
public interface LifePayBillDAO {
    int deleteByPrimaryKey(Integer billId);

    int insert(LifePayBillDO record);

    int insertSelective(LifePayBillDO record);

    LifePayBillDO selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(LifePayBillDO record);

    int updateByPrimaryKey(LifePayBillDO record);
}