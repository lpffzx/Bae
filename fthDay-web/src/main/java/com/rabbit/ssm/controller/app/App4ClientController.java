package com.rabbit.ssm.controller.app;

import com.rabbit.ssm.common.annotation.EXHandle;
import com.rabbit.ssm.common.constant.UTF8MediaType;
import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.common.result.CommonResult;
import com.rabbit.ssm.domain.dto.params.AppPDTO;
import com.rabbit.ssm.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class App4ClientController {
    @Autowired
    AppService aService;

    @EXHandle
    @RequestMapping(value = "/findOne", method = RequestMethod.POST, consumes = UTF8MediaType.JSON, produces = UTF8MediaType.JSON)
    public CommonResult findOne(@RequestBody AppPDTO paramsDTO) throws CommonException {
        CommonResult result = CommonResult.success(aService.selectById(paramsDTO.getId()));
        return result;
    }
}
