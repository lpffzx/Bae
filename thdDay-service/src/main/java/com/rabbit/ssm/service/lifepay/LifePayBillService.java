package com.rabbit.ssm.service.lifepay;


import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.domain.dto.lifepay.LifePayBillDTO;
import com.rabbit.ssm.domain.dto.lifepay.params.LifePayBillPDTO;


public interface LifePayBillService {
    /**
     * 拉取消费账单
     */
    LifePayBillDTO pullBill(LifePayBillPDTO paramsDTO) throws CommonException;

    /**
     * 删除账单
     *
     * @param paramsDTO
     * @return
     * @throws CommonException
     */
    Object deleteBill(LifePayBillPDTO paramsDTO) throws CommonException;


}
