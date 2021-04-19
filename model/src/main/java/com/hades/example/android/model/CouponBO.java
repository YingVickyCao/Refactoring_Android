package com.hades.example.android.model;

public class CouponBO {
    private static final long serialVersionUID = -8022957276104379230L;
    private int id;                // 券id
    private String name;           // 券名称
    private String introduce;      // 券简介
    private int modelType;         // 券类型，1为现金券，2为抵扣券，3为折扣券
    private double faceValue;      // 现金券的面值
    private double estimateAmount; // 现金券的售价
    private double debitAmount;    // 抵扣券的抵扣金额
    private double discount;       // 折扣券的折扣率（0-100）
    private double miniAmount;     // 抵扣券和折扣券的最小使用金额

    // TODO 所有属性的getter和setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getModelType() {
        return modelType;
    }

    public void setModelType(int modelType) {
        this.modelType = modelType;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    public double getEstimateAmount() {
        return estimateAmount;
    }

    public void setEstimateAmount(double estimateAmount) {
        this.estimateAmount = estimateAmount;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getMiniAmount() {
        return miniAmount;
    }

    public void setMiniAmount(double miniAmount) {
        this.miniAmount = miniAmount;
    }
}