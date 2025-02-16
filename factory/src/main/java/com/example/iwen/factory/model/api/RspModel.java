package com.example.iwen.factory.model.api;

import java.util.Date;

/**
 * author : Iwen大大怪
 * create : 2020/11/17 12:05
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class RspModel<T> {
    public static final int SUCCEED = 0;
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_NOT_FOUND_USER = 4041;
    public static final int ERROR_NOT_FOUND_GROUP = 4042;
    public static final int ERROR_NOT_FOUND_GROUP_MEMBER = 4043;
    public static final int ERROR_CREATE_USER = 3001;
    public static final int ERROR_CREATE_GROUP = 3002;
    public static final int ERROR_CREATE_MESSAGE = 3003;
    public static final int ERROR_PARAMETERS = 4001;
    public static final int ERROR_PARAMETERS_EXIST_ACCOUNT = 4002;
    public static final int ERROR_PARAMETERS_EXIST_NAME = 4003;
    public static final int ERROR_SERVICE = 5001;
    public static final int ERROR_ACCOUNT_TOKEN = 2001;
    public static final int ERROR_ACCOUNT_LOGIN = 2002;
    public static final int ERROR_ACCOUNT_REGISTER = 2003;
    public static final int ERROR_ACCOUNT_NO_PERMISSION = 2010;

    private int code;
    private String msg;
    private Date time;
    private T data;

    public boolean success() {
        return code == SUCCEED;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}