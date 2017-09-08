package com.rabbit.ssm.domain.model;

import java.util.Date;

public class LifePayRecordDO {
    private Integer recordId;

    private Date lastModifyDate;

    private Double powerCost;

    private Integer recordMonth;

    private Double waterCost;

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

    public Double getPowerCost() {
        return powerCost;
    }

    public void setPowerCost(Double powerCost) {
        this.powerCost = powerCost;
    }

    public Integer getRecordMonth() {
        return recordMonth;
    }

    public void setRecordMonth(Integer recordMonth) {
        this.recordMonth = recordMonth;
    }

    public Double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(Double waterCost) {
        this.waterCost = waterCost;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }
}