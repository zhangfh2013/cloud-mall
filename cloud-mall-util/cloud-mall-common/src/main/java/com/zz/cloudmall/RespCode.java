package com.zz.cloudmall;

/**
 * 
 */
public enum RespCode {
    SUCCESS(200000, "操作成功"),
    ERROR(200001, "操作失败"),
    SYSTEM_ERROR(299999, "系统错误");

    private Integer code;
    private String message;

    RespCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    RespCode() {
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
