package com.rabbit.ssm.service;


import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.domain.dto.LifePayBillDTO;
import com.rabbit.ssm.domain.dto.params.LifePayBillPDTO;


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

    /**
     * @param paramsDTO
     * @return
     * @throws CommonException
     */
    Object updateBill(LifePayBillPDTO paramsDTO) throws CommonException;


    LifePayBillDTO findByBillMonth(LifePayBillPDTO paramsDTO) throws CommonException;


}
