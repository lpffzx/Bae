package com.rabbit.ssm.domain.dto.params;


import com.rabbit.ssm.domain.model.jpa.LifePayFamily;
import com.rabbit.ssm.domain.model.jpa.LifePayPowerUseRecord;
import com.rabbit.ssm.domain.model.jpa.LifePayUser;
import com.rabbit.ssm.domain.model.mybatis.LifePayFamilyDO;
import com.rabbit.ssm.domain.model.mybatis.LifePayPowerUseRecordDO;
import com.rabbit.ssm.domain.model.mybatis.LifePayUserDO;

import java.io.Serializable;
import java.util.Set;

public class LifePayUserPDTO implements Serializable {
    private Integer familyId;

    private Set<LifePayUserDO> familyMembers;

    private Set<LifePayUser> familyMembers4Jpa;

    private LifePayFamilyDO family;

    private LifePayFamily family4Jpa;

    private LifePayPowerUseRecordDO powerUseRecord;

    private LifePayPowerUseRecord powerUseRecord4Jpa;

    public Set<LifePayUser> getFamilyMembers4Jpa() {
        return familyMembers4Jpa;
    }

    public void setFamilyMembers4Jpa(Set<LifePayUser> familyMembers4Jpa) {
        this.familyMembers4Jpa = familyMembers4Jpa;
    }

    public LifePayFamily getFamily4Jpa() {
        return family4Jpa;
    }

    public void setFamily4Jpa(LifePayFamily family4Jpa) {
        this.family4Jpa = family4Jpa;
    }

    public LifePayPowerUseRecord getPowerUseRecord4Jpa() {
        return powerUseRecord4Jpa;
    }

    public void setPowerUseRecord4Jpa(LifePayPowerUseRecord powerUseRecord4Jpa) {
        this.powerUseRecord4Jpa = powerUseRecord4Jpa;
    }

    public LifePayPowerUseRecordDO getPowerUseRecord() {
        return powerUseRecord;
    }

    public void setPowerUseRecord(LifePayPowerUseRecordDO powerUseRecord) {
        this.powerUseRecord = powerUseRecord;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public LifePayFamilyDO getFamily() {
        return family;
    }

    public void setFamily(LifePayFamilyDO family) {
        this.family = family;
    }

    public Set<LifePayUserDO> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Set<LifePayUserDO> familyMembers) {
        this.familyMembers = familyMembers;
    }
}
