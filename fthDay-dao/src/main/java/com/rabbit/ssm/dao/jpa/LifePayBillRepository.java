package com.rabbit.ssm.dao.jpa;

import com.rabbit.ssm.domain.model.jpa.LifePayBill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mr.Rabbit on 2017/6/22.
 */
public interface LifePayBillRepository extends JpaRepository<LifePayBill, Integer> {

    LifePayBill findByRecordMonth(Integer recordMonth);

}
