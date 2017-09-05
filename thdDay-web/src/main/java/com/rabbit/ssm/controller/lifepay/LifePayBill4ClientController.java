package com.rabbit.ssm.controller.lifepay;


import com.rabbit.ssm.common.annotation.EXHandle;
import com.rabbit.ssm.common.constant.UTF8MediaType;
import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.common.result.CommonResult;
import com.rabbit.ssm.domain.dto.lifepay.params.LifePayBillPDTO;
import com.rabbit.ssm.service.lifepay.LifePayBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lifepay/bill")
public class LifePayBill4ClientController {

    @Autowired
    LifePayBillService lpbService;

    @EXHandle
    @RequestMapping(value = "/pullBill", method = RequestMethod.POST, consumes = UTF8MediaType.JSON, produces = UTF8MediaType.JSON)
    public CommonResult pullBill(@RequestBody LifePayBillPDTO paramsDTO) throws CommonException {
        CommonResult result = CommonResult.success(lpbService.pullBill(paramsDTO));
        return result;
    }

    @EXHandle
    @RequestMapping(value = "/deleteBill", method = RequestMethod.POST, consumes = UTF8MediaType.JSON, produces = UTF8MediaType.JSON)
    public CommonResult deleteBill(@RequestBody LifePayBillPDTO paramsDTO) throws CommonException {
        CommonResult result = CommonResult.success(lpbService.deleteBill(paramsDTO));
        return result;
    }


}
