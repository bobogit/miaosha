package com.miaoshaproject.error;

import lombok.Data;
import lombok.Getter;

/**
 * Created By wangbo
 * 2019/8/26
 */
@Getter
public enum EmBusinessError implements CommonError {

    //通用错误类型 00001
    PARAMTER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10002, "未知错误"),

    // 10000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001, "用户不存在"),

    ;

    private int errCode;

    private String errMsg;

    @Override
    public int getErrCode() {
        return 0;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
}
