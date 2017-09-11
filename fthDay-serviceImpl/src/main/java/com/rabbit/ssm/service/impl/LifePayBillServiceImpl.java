package com.rabbit.ssm.service.impl;


import com.rabbit.ssm.common.constant.Constants;
import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.common.result.CommonErrorMessage;
import com.rabbit.ssm.common.util.AssertUtils;
import com.rabbit.ssm.dao.mybatis.LifePayBillDAO;
import com.rabbit.ssm.domain.dto.LifePayBillDTO;
import com.rabbit.ssm.domain.dto.params.LifePayBillPDTO;
import com.rabbit.ssm.domain.model.mybatis.LifePayBillDO;
import com.rabbit.ssm.domain.model.mybatis.LifePayBillDOExample;
import com.rabbit.ssm.service.LifePayBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(transactionManager = "tm4mybatis")
public class LifePayBillServiceImpl implements LifePayBillService {
    @Autowired
    LifePayBillDAO lpbDAO;
//    @Autowired
//    Jedis jedis;

    public LifePayBillDTO pullBill(LifePayBillPDTO paramsDTO) throws CommonException {
        if (null == paramsDTO) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        LifePayBillDO bill = paramsDTO.getBill();
        if (null == bill) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        lpbDAO.insert(bill);
        LifePayBillDTO result = new LifePayBillDTO();
        result.setPowerBill(bill.getPowerBill());
        result.setPowerRate(bill.getPowerRate());
        result.setWaterBill(bill.getWaterBill());
        result.setWaterRate(bill.getWaterRate());
        result.setRecordMonth(bill.getRecordMonth());
        return result;
    }

    public Object deleteBill(LifePayBillPDTO paramsDTO) throws CommonException {
        if (null == paramsDTO) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        Integer billId = paramsDTO.getBillId();
        if (null == billId) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        Integer deleteFeedBack = lpbDAO.deleteByPrimaryKey(billId);
        if (1 != deleteFeedBack) {
            throw new CommonException(CommonErrorMessage.LIFEPAY_BILL_NOT_EXIST_ERR);
        }
        return Constants.OK;
    }

    public Object updateBill(LifePayBillPDTO paramsDTO) throws CommonException {

        if (null == paramsDTO) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        Integer billId = paramsDTO.getBillId();
        if (null == billId) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }

        LifePayBillDO bill = lpbDAO.selectByPrimaryKey(billId);
        if (null == bill) {
            throw new CommonException(CommonErrorMessage.LIFEPAY_BILL_NOT_EXIST_ERR);
        }
        Double powerBill = bill.getPowerBill();
        powerBill++;
        bill.setPowerBill(powerBill);
        Integer updateFeedBack = lpbDAO.updateByPrimaryKey(bill);
        if (1 != updateFeedBack) {
            throw new CommonException(CommonErrorMessage.LIFEPAY_BILL_UPDATE_ERR);
        }

        return Constants.OK;
    }

    public LifePayBillDTO findByBillMonth(LifePayBillPDTO paramsDTO) throws CommonException {

        if (null == paramsDTO) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_ERR);
        }
        Integer billMonth = paramsDTO.getBillMonth();
        if (null == billMonth) {
            throw new CommonException(CommonErrorMessage.INTERFACE_NO_PARAMS_NEEDED_ERR);
        }
        LifePayBillDOExample lifePayBillDOExample = new LifePayBillDOExample();
        LifePayBillDOExample.Criteria criteria = lifePayBillDOExample.createCriteria();
        criteria.andRecordMonthEqualTo(billMonth);
        List<LifePayBillDO> bills = lpbDAO.selectByExample(lifePayBillDOExample);
        if (AssertUtils.isListEmpty(bills)) {
            throw new CommonException(CommonErrorMessage.LIFEPAY_BILL_NOT_EXIST_ERR);
        }
        LifePayBillDO bill = bills.get(0);
        if (null == bill) {
            throw new CommonException(CommonErrorMessage.LIFEPAY_BILL_NOT_EXIST_ERR);
        }
        LifePayBillDTO result = new LifePayBillDTO();
        result.setPowerBill(bill.getPowerBill());
        result.setPowerRate(bill.getPowerRate());
        result.setWaterBill(bill.getWaterBill());
        result.setWaterRate(bill.getWaterRate());
        result.setRecordMonth(bill.getRecordMonth());
        return result;
    }
}
