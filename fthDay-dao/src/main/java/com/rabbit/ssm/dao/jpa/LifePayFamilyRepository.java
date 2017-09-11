package com.rabbit.ssm.dao.jpa;

import com.rabbit.ssm.domain.model.jpa.LifePayFamily;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifePayFamilyRepository extends JpaRepository<LifePayFamily, Integer> {

    LifePayFamily findByFamilyId(Integer familyId);

    LifePayFamily findByHousemasterName(String hn);
}