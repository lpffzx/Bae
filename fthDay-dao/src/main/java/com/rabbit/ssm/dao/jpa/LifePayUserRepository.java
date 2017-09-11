package com.rabbit.ssm.dao.jpa;

import com.rabbit.ssm.domain.model.jpa.LifePayUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifePayUserRepository extends JpaRepository<LifePayUser, Integer> {

    LifePayUser getByName(String name);
}
