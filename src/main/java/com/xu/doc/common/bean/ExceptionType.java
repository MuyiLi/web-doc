package com.xu.doc.common.bean;

/**
 * Enum 响应类型枚举
 *
 * @date 16/11/01
 * @auther hua xu
 */
public enum ExceptionType {

    SUCCESS("00","success"),
    INCOMING_DATA_ERROR("500001","传入数据错误"),
    MISS_PARAM("500002","参数缺失"),
    UNKNOWN_ERROR("500003","未知错误"),
    DUPLICATE_USER("500004","账户名已存在"),
    ROLE_ERROR("500005","不具备该角色权限"),
    DEPARTMENT_ERROR("500006","不具备该部门权限"),
    ADD_ERROR("500007","添加失败"),
    UPDATE_ERROR("500008","更新失败"),
    DELETE_ERROR("500009","删除失败"),
    LOCK_ERROR("500010","锁定失败"),
    ;

    private String code;
    private String message;

    ExceptionType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
