package com.rabbit.ssm.dao.mybatis;

import com.rabbit.ssm.domain.model.mybatis.LifePayFamilyDO;
import com.rabbit.ssm.domain.model.mybatis.LifePayFamilyDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LifePayFamilyDAO {

    LifePayFamilyDO findByFamilyId(Integer familyId);

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