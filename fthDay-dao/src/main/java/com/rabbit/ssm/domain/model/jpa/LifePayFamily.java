package com.rabbit.ssm.domain.model.jpa;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "lifepay_family")
public class LifePayFamily implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "family_id", columnDefinition = "INT(11) COMMENT '家庭id(主键)'")
    private int familyId;

    @Basic
    @Column(name = "housemaster_name", nullable = false, columnDefinition = "VARCHAR(50) COMMENT '户主姓名'")
    private String housemasterName;

    @Basic(fetch = FetchType.LAZY)
//    @CreationTimestamp
    @UpdateTimestamp
    @Column(name = "last_modify_date", columnDefinition = "DATETIME COMMENT '修改时间'")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8:00")
    private Date lastModifyDate = new Date();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "family", cascade = CascadeType.ALL)
    @OrderBy(value = "name")
    private Set<LifePayUser> familyMembers;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "family", cascade = CascadeType.ALL)
    @OrderBy(value = "recordMonth")
    private Set<LifePayRecord> records;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "family", cascade = CascadeType.ALL)
    @OrderBy(value = "recordMonth")
    private Set<LifePayPowerUseRecord> powerUseRecords;

    public Set<LifePayUser> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Set<LifePayUser> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public Set<LifePayRecord> getRecords() {
        return records;
    }

    public void setRecords(Set<LifePayRecord> records) {
        this.records = records;
    }

    public Set<LifePayPowerUseRecord> getPowerUseRecords() {
        return powerUseRecords;
    }

    public void setPowerUseRecords(Set<LifePayPowerUseRecord> powerUseRecords) {
        this.powerUseRecords = powerUseRecords;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public String getHousemasterName() {
        return housemasterName;
    }

    public void setHousemasterName(String housemasterName) {
        this.housemasterName = housemasterName;
    }


    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

}
