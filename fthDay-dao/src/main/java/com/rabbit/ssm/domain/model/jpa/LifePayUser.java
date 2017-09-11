package com.rabbit.ssm.domain.model.jpa;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "lifepay_user")
public class LifePayUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usr_id", columnDefinition = "INT(11) COMMENT '用户id(主键)'")
    private int usrId;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(50) COMMENT '用户姓名'")
    private String name;

    @Basic(fetch = FetchType.LAZY)
//    @CreationTimestamp
    @UpdateTimestamp
    @Column(name = "last_modify_date", columnDefinition = "DATETIME COMMENT '修改时间'")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8:00")
    private Date lastModifyDate = new Date();

    @ManyToOne(fetch = FetchType.LAZY)
    @JSONField(serialize = false)
    @JoinColumn(name = "family_id", nullable = false)
    private LifePayFamily family;

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LifePayFamily getFamily() {
        return family;
    }

    public void setFamily(LifePayFamily family) {
        this.family = family;
    }
}
