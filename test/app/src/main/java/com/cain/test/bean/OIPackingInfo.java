package com.cain.test.bean;

import java.io.Serializable;


public class OIPackingInfo  {
    private String packingId;
    private String packingType;
    private int distributeNum;
    private String packingName;
    private int returnNum;

    public String getPackingId() {
        return packingId;
    }

    public void setPackingId(String packingId) {
        this.packingId = packingId;
    }

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    public int getDistributeNum() {
        return distributeNum;
    }

    public void setDistributeNum(int distributeNum) {
        this.distributeNum = distributeNum;
    }

    public String getPackingName() {
        return packingName;
    }

    public void setPackingName(String packingName) {
        this.packingName = packingName;
    }

    public int getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(int returnNum) {
        this.returnNum = returnNum;
    }


    @Override
    public String toString() {
        return "OIPackingInfo{" +
                "packingId='" + packingId + '\'' +
                ", packingType='" + packingType + '\'' +
                ", distributeNum=" + distributeNum +
                ", packingName='" + packingName + '\'' +
                ", returnNum=" + returnNum +
                '}';
    }
}
