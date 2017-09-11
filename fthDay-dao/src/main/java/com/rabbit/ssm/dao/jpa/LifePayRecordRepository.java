package com.rabbit.ssm.dao.jpa;

import com.rabbit.ssm.domain.model.jpa.LifePayFamily;
import com.rabbit.ssm.domain.model.jpa.LifePayRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Mr.Rabbit on 2017/6/22.
 */
public interface LifePayRecordRepository extends JpaRepository<LifePayRecord, Integer> {

    List<LifePayRecord> findAllByRecordMonth(Integer recordMonth);

    LifePayRecord findByRecordMonthAndFamily(Integer recordMonth, LifePayFamily family);

}
