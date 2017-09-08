package com.rabbit.ssm.domain.model;

import java.util.Date;

public class LifePayPowerUseRecordDO {
    private Integer recordId;

    private Date lastModifyDate;

    private Double powerUse;

    private Integer recordMonth;

    private Integer familyId;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Double getPowerUse() {
        return powerUse;
    }

    public void setPowerUse(Double powerUse) {
        this.powerUse = powerUse;
    }

    public Integer getRecordMonth() {
        return recordMonth;
    }

    public void setRecordMonth(Integer recordMonth) {
        this.recordMonth = recordMonth;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }
}