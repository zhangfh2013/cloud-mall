package com.zz.cloudmall;

import java.io.Serializable;

/**
 * @author zz
 * @create 2021-03-08 23:07
 **/
public class RespResult<T> implements Serializable {
    /**
     * 响应数据结果集
     */
    private T data;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    public RespResult() {
    }

    public RespResult(RespCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public RespResult(T data, RespCode resultCode) {
        this.data = data;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public static RespResult OK() {
        return new RespResult(null, RespCode.SUCCESS);
    }

    public static RespResult OK(Object data) {
        return new RespResult(data, RespCode.SUCCESS);
    }

    public static RespResult error() {
        return new RespResult(null, RespCode.ERROR);
    }

    public static RespResult error(String message) {
        return secByError(RespCode.ERROR.getCode(), message);
    }

    public static RespResult secByError(Integer code, String message) {
        RespResult err = new RespResult();
        err.setCode(code);
        err.setMessage(message);
        return err;
    }

    public static RespResult secByError(RespCode resultCode) {
        return new RespResult(resultCode);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
