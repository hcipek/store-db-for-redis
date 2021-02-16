package com.ebebek.demo.util;

import lombok.AllArgsConstructor;

public class ResponseCodesUtil {

    public static final ResponseMessageCode SUCCESS = new ResponseMessageCode("SUCCESS", 7001);
    public static final ResponseMessageCode FAILED = new ResponseMessageCode("FAILED", 7002);
    public static final ResponseMessageCode ERROR = new ResponseMessageCode("ERROR", 7003);

    @AllArgsConstructor
    public static class ResponseMessageCode {
        public String message;
        public int code;
    }
}
