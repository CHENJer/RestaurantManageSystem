package com.itcast.pojo;

public class Tables {
    private String tId;

    private Integer tNum;

    private Boolean tState;

    private String tComm;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public Integer gettNum() {
        return tNum;
    }

    public void settNum(Integer tNum) {
        this.tNum = tNum;
    }

    public Boolean gettState() {
        return tState;
    }

    public void settState(Boolean tState) {
        this.tState = tState;
    }

    public String gettComm() {
        return tComm;
    }

    public void settComm(String tComm) {
        this.tComm = tComm == null ? null : tComm.trim();
    }
}