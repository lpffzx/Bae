package com.rabbit.ssm.dao.jpa;

import com.rabbit.ssm.domain.model.jpa.LifePayPowerUseRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifePayPowerUseRecordRepository extends JpaRepository<LifePayPowerUseRecord, Integer> {

    LifePayPowerUseRecord findByRecordMonthAndFamilyNull(Integer recordMonth);
}
