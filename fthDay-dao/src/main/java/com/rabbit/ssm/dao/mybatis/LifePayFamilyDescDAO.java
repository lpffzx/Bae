package com.rabbit.ssm.dao.mybatis;

import com.rabbit.ssm.domain.model.mybatis.LifePayFamilyDescDO;
import com.rabbit.ssm.domain.model.mybatis.LifePayFamilyDescDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface LifePayFamilyDescDAO {
    long countByExample(LifePayFamilyDescDOExample example);

    int deleteByExample(LifePayFamilyDescDOExample example);

    int deleteByPrimaryKey(Integer descId);

    int insert(LifePayFamilyDescDO record);

    int insertSelective(LifePayFamilyDescDO record);

    List<LifePayFamilyDescDO> selectByExample(LifePayFamilyDescDOExample example);

    LifePayFamilyDescDO selectByPrimaryKey(Integer descId);

    LifePayFamilyDescDO selectByFamilyId(Integer familyId);

    int updateByExampleSelective(@Param("record") LifePayFamilyDescDO record, @Param("example") LifePayFamilyDescDOExample example);

    int updateByExample(@Param("record") LifePayFamilyDescDO record, @Param("example") LifePayFamilyDescDOExample example);

    int updateByPrimaryKeySelective(LifePayFamilyDescDO record);

    int updateByPrimaryKey(LifePayFamilyDescDO record);
}