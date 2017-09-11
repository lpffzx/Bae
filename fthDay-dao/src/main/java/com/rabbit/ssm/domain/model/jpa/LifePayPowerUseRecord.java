package com.rabbit.ssm.domain.model.jpa;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "lifepay_power_use_record")
public class LifePayPowerUseRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "record_id", columnDefinition = "INT(11) COMMENT '记录id(主键)'")
    private int recordId;

    @Basic
    @Column(name = "power_use", nullable = false, columnDefinition = "DOUBLE(10,2) COMMENT '用电量'")
    private Double powerUse;


    @Basic(fetch = FetchType.LAZY)
    @UpdateTimestamp
    @Column(name = "last_modify_date", columnDefinition = "DATETIME COMMENT '修改时间'")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8:00")
    private Date lastModifyDate = new Date();

    @ManyToOne(fetch = FetchType.LAZY)
    @JSONField(serialize = false)
    @JoinColumn(name = "family_id", nullable = true)
    private LifePayFamily family;

    @Basic
    @Column(name = "record_month", columnDefinition = "INT(2) COMMENT '记录月份'")
    private int recordMonth;

    public int getRecordMonth() {
        return recordMonth;
    }

    public void setRecordMonth(int recordMonth) {
        this.recordMonth = recordMonth;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Double getPowerUse() {
        return powerUse;
    }

    public void setPowerUse(Double powerUse) {
        this.powerUse = powerUse;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public LifePayFamily getFamily() {
        return family;
    }

    public void setFamily(LifePayFamily family) {
        this.family = family;
    }
}
