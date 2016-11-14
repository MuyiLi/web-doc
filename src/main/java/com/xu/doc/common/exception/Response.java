package com.xu.doc.common.exception;

import com.xu.doc.common.bean.ExceptionType;
import net.sf.json.JSONObject;

/**
 * 对外返回的错误json
 *
 * @author hua xu
 * @version 1.2.11
 * @date 16/08/01
 */
public class Response{
    private static final String RESPONSE = "response_code";
    private static final String MESSAGE = "message";
    private static final String CONTENT="content";


    public static JSONObject json(String response_code, String massage) {
        JSONObject response = new JSONObject();

        response.put(RESPONSE, response_code);
        response.put(MESSAGE, massage);

        return response;
    }

    public static JSONObject msg(ExceptionType exceptionType) {
        JSONObject response = new JSONObject();

        response.put(RESPONSE, exceptionType.getCode());
        response.put(MESSAGE, exceptionType.getMessage());

        return response;
    }

    public static JSONObject msg(ExceptionType exceptionType, Object data) {
        JSONObject response = new JSONObject();

        response.put(RESPONSE, exceptionType.getCode());
        response.put(MESSAGE, exceptionType.getMessage());
        response.put(CONTENT, data);

        return response;
    }

    public static JSONObject data(Object data) {
        JSONObject response = new JSONObject();

        response.put(RESPONSE, ExceptionType.SUCCESS.getCode());
        response.put(MESSAGE, ExceptionType.SUCCESS.getMessage());
        response.put(CONTENT, data);

        return response;
    }

}

