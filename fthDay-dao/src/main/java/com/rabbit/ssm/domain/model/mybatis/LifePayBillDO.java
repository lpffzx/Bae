package com.rabbit.ssm.domain.model.mybatis;

import java.io.Serializable;
import java.util.Date;

public class LifePayBillDO implements Serializable {
    private Integer billId;

    private Date lastModifyDate;

    private Double powerBill;

    private Double powerRate;

    private Integer recordMonth;

    private Double waterBill;

    private Double waterRate;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Double getPowerBill() {
        return powerBill;
    }

    public void setPowerBill(Double powerBill) {
        this.powerBill = powerBill;
    }

    public Double getPowerRate() {
        return powerRate;
    }

    public void setPowerRate(Double powerRate) {
        this.powerRate = powerRate;
    }

    public Integer getRecordMonth() {
        return recordMonth;
    }

    public void setRecordMonth(Integer recordMonth) {
        this.recordMonth = recordMonth;
    }

    public Double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(Double waterBill) {
        this.waterBill = waterBill;
    }

    public Double getWaterRate() {
        return waterRate;
    }

    public void setWaterRate(Double waterRate) {
        this.waterRate = waterRate;
    }
}