package com.rabbit.ssm.domain.model;

import java.util.Date;

public class LifePayFamilyDO {
    private Integer familyId;

    private String housemasterName;

    private Date lastModifyDate;

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public String getHousemasterName() {
        return housemasterName;
    }

    public void setHousemasterName(String housemasterName) {
        this.housemasterName = housemasterName == null ? null : housemasterName.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}