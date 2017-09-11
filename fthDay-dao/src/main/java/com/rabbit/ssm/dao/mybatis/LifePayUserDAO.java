package com.rabbit.ssm.dao.mybatis;

import com.rabbit.ssm.domain.model.mybatis.LifePayUserDO;
import com.rabbit.ssm.domain.model.mybatis.LifePayUserDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LifePayUserDAO {
    long countByExample(LifePayUserDOExample example);

    int deleteByExample(LifePayUserDOExample example);

    int deleteByPrimaryKey(Integer usrId);

    int insert(LifePayUserDO record);

    int insertSelective(LifePayUserDO record);

    List<LifePayUserDO> selectByExample(LifePayUserDOExample example);

    LifePayUserDO selectByPrimaryKey(Integer usrId);

    List<LifePayUserDO> selectByFamilyId(Integer familyId);

    int updateByExampleSelective(@Param("record") LifePayUserDO record, @Param("example") LifePayUserDOExample example);

    int updateByExample(@Param("record") LifePayUserDO record, @Param("example") LifePayUserDOExample example);

    int updateByPrimaryKeySelective(LifePayUserDO record);

    int updateByPrimaryKey(LifePayUserDO record);
}