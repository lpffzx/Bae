package com.rabbit.ssm.dao;

import com.rabbit.ssm.domain.model.LifePayFamilyDO;
import com.rabbit.ssm.domain.model.LifePayFamilyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LifePayFamilyDAO {
    long countByExample(LifePayFamilyDOExample example);

    int deleteByExample(LifePayFamilyDOExample example);

    int deleteByPrimaryKey(Integer familyId);

    int insert(LifePayFamilyDO record);

    int insertSelective(LifePayFamilyDO record);

    List<LifePayFamilyDO> selectByExample(LifePayFamilyDOExample example);

    LifePayFamilyDO selectByPrimaryKey(Integer familyId);

    int updateByExampleSelective(@Param("record") LifePayFamilyDO record, @Param("example") LifePayFamilyDOExample example);

    int updateByExample(@Param("record") LifePayFamilyDO record, @Param("example") LifePayFamilyDOExample example);

    int updateByPrimaryKeySelective(LifePayFamilyDO record);

    int updateByPrimaryKey(LifePayFamilyDO record);
}