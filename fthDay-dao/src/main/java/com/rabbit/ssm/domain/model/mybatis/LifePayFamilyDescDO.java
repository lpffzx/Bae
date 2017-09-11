package com.rabbit.ssm.domain.model.mybatis;

import java.io.Serializable;
import java.util.Date;

public class LifePayFamilyDescDO implements Serializable {
    private Integer descId;

    private String centent;

    private Date lastModifyDate;

    private Integer familyId;

    public Integer getDescId() {
        return descId;
    }

    public void setDescId(Integer descId) {
        this.descId = descId;
    }

    public String getCentent() {
        return centent;
    }

    public void setCentent(String centent) {
        this.centent = centent == null ? null : centent.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }
}