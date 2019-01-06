package com.itcast.pojo;

import java.util.Date;

public class Notice {
    private Integer nId;

    private String nComm;

    private Date nTime;

    private Date nKeeptime;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getnComm() {
        return nComm;
    }

    public void setnComm(String nComm) {
        this.nComm = nComm == null ? null : nComm.trim();
    }

    public Date getnTime() {
        return nTime;
    }

    public void setnTime(Date nTime) {
        this.nTime = nTime;
    }

    public Date getnKeeptime() {
        return nKeeptime;
    }

    public void setnKeeptime(Date nKeeptime) {
        this.nKeeptime = nKeeptime;
    }
}