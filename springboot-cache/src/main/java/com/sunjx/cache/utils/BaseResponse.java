package com.sunjx.cache.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;


/**
 * Created by zhx on 16/9/12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    private int result;
    private Object data;

    /**
     * 请求成功 返回值
     * @param data
     * @return
     */
    public static BaseResponse successed(Object data){
        return new BaseResponse(1,data);
    }

    public static BaseResponse successed(String message){
        HashMap retMap = new HashMap();
        retMap.put("msg",message);
        return new BaseResponse(1,retMap);
    }

    /**
     * 请求失败 返回值
     * @param data
     * @return
     */
    public static BaseResponse failed(Object data){
        return new BaseResponse(0,data);
    }

    /**
     * 构建请求失败错误信息
     * @param errorCode
     * @param errorMessage
     * @param errorDescription
     * @return
     */
    public static HashMap<String,String> buildErrorMsg(String errorCode,String errorMessage,String errorDescription)
    {
        HashMap<String,String> errorMap = new HashMap<String, String>();
        errorMap.put("errCode",errorCode);
        errorMap.put("errMsg",errorMessage);
        errorMap.put("errDesc",errorDescription);
        return errorMap;
    }
}
