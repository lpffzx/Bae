package com.rabbit.ssm.dao;

import com.rabbit.ssm.domain.model.LifePayBillDO;
import com.rabbit.ssm.domain.model.LifePayBillDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface LifePayBillDAO {
    long countByExample(LifePayBillDOExample example);

    int deleteByExample(LifePayBillDOExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(LifePayBillDO record);

    int insertSelective(LifePayBillDO record);

    List<LifePayBillDO> selectByExample(LifePayBillDOExample example);

    LifePayBillDO selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") LifePayBillDO record, @Param("example") LifePayBillDOExample example);

    int updateByExample(@Param("record") LifePayBillDO record, @Param("example") LifePayBillDOExample example);

    int updateByPrimaryKeySelective(LifePayBillDO record);

    int updateByPrimaryKey(LifePayBillDO record);
}