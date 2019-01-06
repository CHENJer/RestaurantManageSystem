package com.itcast.pojo;

import java.util.Date;

public class Orders {
    private String oId;

    private String cId;

    private Integer fId;

    private Integer fNum;

    private Double oPrice;

    private String tId;

    private Date oDate;

    private Integer oState;

    private String oComm;

    private Integer uId;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getfNum() {
        return fNum;
    }

    public void setfNum(Integer fNum) {
        this.fNum = fNum;
    }

    public Double getoPrice() {
        return oPrice;
    }

    public void setoPrice(Double oPrice) {
        this.oPrice = oPrice;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
        this.oDate = oDate;
    }

    public Integer getoState() {
        return oState;
    }

    public void setoState(Integer oState) {
        this.oState = oState;
    }

    public String getoComm() {
        return oComm;
    }

    public void setoComm(String oComm) {
        this.oComm = oComm == null ? null : oComm.trim();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}