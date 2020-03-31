package com.atpco.yqyr.exception;

public enum EnumRespMsg {

    SUCCESS("01001", "Result success"),
    CHECK_REQUEST_PARAMETERS("02002", "Some request parameters are invalid"),
    COMPUTING_EXCEPTION("04001", "Program exception");

    EnumRespMsg(String code, String description) {
        this.code = code;
        this.description = description;
    }

    private String code;

    private String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
