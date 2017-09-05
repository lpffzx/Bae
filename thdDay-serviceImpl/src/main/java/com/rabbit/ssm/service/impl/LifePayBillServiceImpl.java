package com.rabbit.ssm.service.impl;


import com.rabbit.ssm.common.constant.Constants;
import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.common.result.CommonErrorMessage;
import com.rabbit.ssm.dao.lifepay.LifePayBillDAO;
import com.rabbit.ssm.domain.dto.lifepay.LifePayBillDTO;
import com.rabbit.ssm.domain.dto.lifepay.params.LifePayBillPDTO;
import com.rabbit.ssm.domain.model.lifepay.LifePayBillDO;
import com.rabbit.ssm.service.lifepay.LifePayBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LifePayBillServiceImpl implements LifePayBillService {
    @Autowired
    LifePayBillDAO lpbDAO;

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
            throw new CommonException(CommonErrorMessage.LIFEPAY_BILL_DELETE_ERR);
        }
        return Constants.OK;
    }
}
