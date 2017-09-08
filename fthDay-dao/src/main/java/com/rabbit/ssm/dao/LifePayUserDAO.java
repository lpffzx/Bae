package com.rabbit.ssm.dao;

import com.rabbit.ssm.domain.model.LifePayUserDO;
import com.rabbit.ssm.domain.model.LifePayUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LifePayUserDAO {
    long countByExample(LifePayUserDOExample example);

    int deleteByExample(LifePayUserDOExample example);

    int deleteByPrimaryKey(Integer usrId);

    int insert(LifePayUserDO record);

    int insertSelective(LifePayUserDO record);

    List<LifePayUserDO> selectByExample(LifePayUserDOExample example);

    LifePayUserDO selectByPrimaryKey(Integer usrId);

    int updateByExampleSelective(@Param("record") LifePayUserDO record, @Param("example") LifePayUserDOExample example);

    int updateByExample(@Param("record") LifePayUserDO record, @Param("example") LifePayUserDOExample example);

    int updateByPrimaryKeySelective(LifePayUserDO record);

    int updateByPrimaryKey(LifePayUserDO record);
}