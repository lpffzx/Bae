package com.rabbit.ssm.dao;

import com.rabbit.ssm.domain.model.LifePayPowerUseRecordDO;
import com.rabbit.ssm.domain.model.LifePayPowerUseRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LifePayPowerUseRecordDAO {
    long countByExample(LifePayPowerUseRecordDOExample example);

    int deleteByExample(LifePayPowerUseRecordDOExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(LifePayPowerUseRecordDO record);

    int insertSelective(LifePayPowerUseRecordDO record);

    List<LifePayPowerUseRecordDO> selectByExample(LifePayPowerUseRecordDOExample example);

    LifePayPowerUseRecordDO selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") LifePayPowerUseRecordDO record, @Param("example") LifePayPowerUseRecordDOExample example);

    int updateByExample(@Param("record") LifePayPowerUseRecordDO record, @Param("example") LifePayPowerUseRecordDOExample example);

    int updateByPrimaryKeySelective(LifePayPowerUseRecordDO record);

    int updateByPrimaryKey(LifePayPowerUseRecordDO record);
}