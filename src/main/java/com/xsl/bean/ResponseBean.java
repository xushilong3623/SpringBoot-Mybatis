package com.xsl.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求返回实体类
 */
public class ResponseBean {
    /**
     * 当前时间戳，秒
     */
    private Long at;
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回结果
     */
    private Map<String, Object> result;

    /**
     * 请求成功
     */
    public static final Integer CODE_SUCCESS=200;


    public ResponseBean(Integer code, String err) {
        this.code = code;
        this.at = System.currentTimeMillis() / 1000;
        this.result = new HashMap<>();
        this.result.put("msg", err);
    }

    public ResponseBean() {
        this.at = System.currentTimeMillis() / 1000;
    }

    public Long getAt() {
        return at;
    }

    public void setAt(Long at) {
        this.at = at;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

}
