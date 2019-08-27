package com.miaoshaproject.error;

/**
 * Created By wangbo
 * 2019/8/26
 */
public interface CommonError {

    int getErrCode();

    String getErrMsg();

    CommonError setErrMsg(String errMsg);
}
