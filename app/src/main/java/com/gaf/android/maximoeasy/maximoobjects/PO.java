package com.gaf.android.maximoeasy.maximoobjects;

/**
 * Created by valla on 12/21/2017.
 */

public class PO {

    private String mPONum;
    private String mDescription;
    private String mStatus;
    private String mVendor;
    private String mPurhcaseAgeng;

    public PO(String ponum, String description, String status, String vendor, String purchaseAgent){
        this.mPONum = ponum;
        this.mDescription = description;
        this.mStatus = status;
        this.mVendor = vendor;
        this.mPurhcaseAgeng = purchaseAgent;
    }

    public String getmPONum() {
        return mPONum;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmStatus() {
        return mStatus;
    }

    public String getmVendor() {
        return mVendor;
    }

    public String getmPurhcaseAgeng() {
        return mPurhcaseAgeng;
    }

    @Override
    public String toString() {
        return "PO{" +
                "mPONum='" + mPONum + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mStatus='" + mStatus + '\'' +
                ", mVendor='" + mVendor + '\'' +
                ", mPurhcaseAgeng='" + mPurhcaseAgeng + '\'' +
                '}';
    }
}
