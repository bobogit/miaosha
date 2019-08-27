package com.miaoshaproject.response;

import lombok.Data;

/**
 * Created By wangbo
 * 2019/8/26
 */
@Data
public class CommonReturnType {

    private String status;  // success / fail

    private Object data;

    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setStatus(status);
        commonReturnType.setData(result);
        return commonReturnType;
    }
}
