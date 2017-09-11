package com.rabbit.ssm.dao.mybatis;

import com.rabbit.ssm.domain.model.mybatis.LifePayRecordDO;
import com.rabbit.ssm.domain.model.mybatis.LifePayRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface LifePayRecordDAO {
    long countByExample(LifePayRecordDOExample example);

    int deleteByExample(LifePayRecordDOExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(LifePayRecordDO record);

    int insertSelective(LifePayRecordDO record);

    List<LifePayRecordDO> selectByExample(LifePayRecordDOExample example);

    LifePayRecordDO selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") LifePayRecordDO record, @Param("example") LifePayRecordDOExample example);

    int updateByExample(@Param("record") LifePayRecordDO record, @Param("example") LifePayRecordDOExample example);

    int updateByPrimaryKeySelective(LifePayRecordDO record);

    int updateByPrimaryKey(LifePayRecordDO record);
}