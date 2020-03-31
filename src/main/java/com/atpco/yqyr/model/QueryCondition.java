package com.atpco.yqyr.model;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by ydc on 2019/10/13.
 */
public class QueryCondition {

    /**
     * 市场方 必传
     */
    private String mktCxr;

    /**
     * 乘客类型
     */
    private String paxType;

    /**
     * 序列号
     */
    private String sequence;

    /**
     * 销售点
     */
    private String salePoint;

    /**
     * 出票点
     */
    private String tktPoint;

    /**
     * 出票日期
     */
    private String tktDate;
    private String tktDt;

    /**
     * 起飞日期
     */
    private String travelDate;
    private String trvlDt;

    /**
     * sector或者journey 必填
     * J / S
     */
    private String apply;

    /**
     * 始发地
     */
    private String orig;

    /**
     * 目的地
     */
    private String dest;

    /**
     * 途径
     */
    private String via;

    /**
     * 子舱位
     */
    private String clazz;

    /**
     * 大舱位
     */
    private String cabin;

    /**
     * 运输设备
     */
    private String eqp;

    /**
     * 扩展 必传
     */
    private String feeType;

    /**
     * 查询结果
     */
    private List<AtpcoYQYRS1> list;

    /**
     * 发布日期 yyyy-MM-dd
     */
    private String pubBegin;
    /**
     * 发布日期 yyyy-MM-dd
     */
    private String pubEnd;

    //以下都不做
//    public String fareClass;
//
//    public String posCode;
//
//    public String tktDesignator;
//
//    public String tktCxr;
//
//    public String opCxr;
//
//    public String fltNo;

    public String getMktCxr() {
        return mktCxr;
    }

    public void setMktCxr(String mktCxr) {
        this.mktCxr = mktCxr;
    }

    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSalePoint() {
        return salePoint;
    }

    public void setSalePoint(String salePoint) {
        this.salePoint = salePoint;
    }

    public String getTktPoint() {
        return tktPoint;
    }

    public void setTktPoint(String tktPoint) {
        this.tktPoint = tktPoint;
    }

    public String getTktDate() {
        return tktDate;
    }

    public void setTktDate(String tktDate) {
        this.tktDate = tktDate;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getEqp() {
        return eqp;
    }

    public void setEqp(String eqp) {
        this.eqp = eqp;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public List<AtpcoYQYRS1> getList() {
        return list;
    }

    public String getTktDt() {
        return tktDt;
    }

    public String getTrvlDt() {
        return trvlDt;
    }

    public void setList(List<AtpcoYQYRS1> list) {
        this.list = list;
    }

    public String getPubBegin() {
        return pubBegin;
    }

    public void setPubBegin(String pubBegin) {
        this.pubBegin = pubBegin;
    }

    public String getPubEnd() {
        return pubEnd;
    }

    public void setPubEnd(String pubEnd) {
        this.pubEnd = pubEnd;
    }

    @Override
    public String toString() {
        return "QueryCondition{" +
                "mktCxr='" + mktCxr + '\'' +
                ", paxType='" + paxType + '\'' +
                ", sequence='" + sequence + '\'' +
                ", salePoint='" + salePoint + '\'' +
                ", tktPoint='" + tktPoint + '\'' +
                ", tktDate='" + tktDate + '\'' +
                ", travelDate='" + travelDate + '\'' +
                ", apply='" + apply + '\'' +
                ", orig='" + orig + '\'' +
                ", dest='" + dest + '\'' +
                ", via='" + via + '\'' +
                ", clazz='" + clazz + '\'' +
                ", cabin='" + cabin + '\'' +
                ", eqp='" + eqp + '\'' +
                ", feeType='" + feeType + '\'' +
                ", list=" + list +
                '}';
    }

    /**
     * mktCxr/feeType 必填
     * 当orig/dest/via有值时，apply必填
     */
    public boolean check() {
        if (StringUtils.isBlank(mktCxr) || StringUtils.isBlank(feeType)) {
            return false;
        }

        if(!StringUtils.isBlank(orig) ||  !StringUtils.isBlank(dest) || !StringUtils.isBlank(via)) {
            if(StringUtils.isBlank(apply)) {
                return false;
            }
        }

        if(!StringUtils.isBlank(tktDate)) {
            tktDt = tktDate.replace("-", "").substring(2);
        }

        if(!StringUtils.isBlank(travelDate)) {
            trvlDt = travelDate.replace("-", "").substring(2);
        }

        return true;
    }
}
