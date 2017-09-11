package com.rabbit.ssm.service.impl;


import com.rabbit.ssm.common.constant.Constants;
import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.common.result.CommonErrorMessage;
import com.rabbit.ssm.common.util.AssertUtils;
import com.rabbit.ssm.dao.jpa.LifePayFamilyRepository;
import com.rabbit.ssm.dao.jpa.LifePayPowerUseRecordRepository;
import com.rabbit.ssm.dao.jpa.LifePayUserRepository;
import com.rabbit.ssm.dao.mybatis.LifePayFamilyDAO;
import com.rabbit.ssm.dao.mybatis.LifePayPowerUseRecordDAO;
import com.rabbit.ssm.dao.mybatis.LifePayUserDAO;
import com.rabbit.ssm.domain.dto.LifePayUserDTO;
import com.rabbit.ssm.domain.dto.params.LifePayUserPDTO;
import com.rabbit.ssm.domain.model.jpa.LifePayFamily;
import com.rabbit.ssm.domain.model.jpa.LifePayPowerUseRecord;
import com.rabbit.ssm.domain.model.jpa.LifePayUser;
import com.rabbit.ssm.service.LifePayUserService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional(transactionManager = "tm4mybatis")
public class LifePayUserServiceImpl implements LifePayUserService {
    @Autowired
    LifePayFamilyDAO llfDAO;
    @Autowired
    LifePayUserDAO lpuDAO;
    @Autowired
    LifePayPowerUseRecordDAO lppurDAO;
    @Autowired
    LifePayFamilyRepository llfRepository;
    @Autowired
    LifePayUserRepository lpuRepository;
    @Autowired
    LifePayPowerUseRecordRepository lppurRepository;


    public LifePayUserDTO createFamily(LifePayUserPDTO paramsDTO) throws CommonException {
        if (null == paramsDTO) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        /**
         * T后缀代表瞬态
         * P后缀代表持久态
         * */
        LifePayFamily familyT = paramsDTO.getFamily4Jpa();
        if (null == familyT) {
            //todo 抛出持久化单元为空异常
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        LifePayFamily familyP = llfRepository.save(familyT);
        LifePayUserDTO result = new LifePayUserDTO();
        result.setFamilyId(familyP.getFamilyId());
        return result;
    }


    public LifePayUserDTO updateFamilyInfo(LifePayUserPDTO paramsDTO) throws CommonException {
        return null;
    }

    public Object addFamilyMember(LifePayUserPDTO paramsDTO) throws CommonException {
        if (null == paramsDTO) {
            //todo 抛出方法参数为空异常
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        Set<LifePayUser> familyMembers = paramsDTO.getFamilyMembers4Jpa();
        Integer familyId = paramsDTO.getFamilyId();
        if (null == familyId) {
            //todo 抛出未选择家庭异常
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        if (AssertUtils.isSetEmpty(familyMembers)) {
            //todo 抛出未选择家庭成员异常
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        LifePayFamily family = new LifePayFamily();
        family.setFamilyId(familyId);
        family.setFamilyMembers(familyMembers);
        llfRepository.save(family);
//        for (LifePayUserDO familyMember : familyMembers) {
//            familyMember.setFamily(family);
//            lpuDAO.save(familyMember);
//        }
        return Constants.OK;
    }

    public Object recordPowerUseSituation(LifePayUserPDTO paramsDTO) throws CommonException {
        if (null == paramsDTO) {
            //todo 抛出方法参数为空异常
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        LifePayPowerUseRecord powerUseRecord = paramsDTO.getPowerUseRecord4Jpa();
        if (null == powerUseRecord) {
            //todo 抛出未输入用电记录异常
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        Integer familyId = paramsDTO.getFamilyId();
        /**
         * 针对公共用电记录不绑定任何家庭
         * */
        if (null == familyId) {
            lppurRepository.save(powerUseRecord);
            return Constants.OK;
        }
        LifePayFamily family = new LifePayFamily();
        family.setFamilyId(familyId);
        powerUseRecord.setFamily(family);
        lppurRepository.save(powerUseRecord);
        return Constants.OK;
    }


    public LifePayFamily findByFamilyId(LifePayUserPDTO paramsDTO) throws CommonException {
        if (null == paramsDTO) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        Integer familyId = paramsDTO.getFamilyId();
        if (null == familyId) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        LifePayFamily family = llfRepository.findByFamilyId(familyId);
        if (null == family) {
            throw new CommonException(CommonErrorMessage.LIFEPAY_FAMILY_INFO_NOT_EXIST_ERR);
        }
        Hibernate.initialize(family.getFamilyMembers());
        Hibernate.initialize(family.getPowerUseRecords());
        Hibernate.initialize(family.getRecords());
        return family;
    }
}
