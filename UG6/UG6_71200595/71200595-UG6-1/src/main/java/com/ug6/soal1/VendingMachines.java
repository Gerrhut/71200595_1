package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private Integer capacity;
    private Integer usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    public VendingMachines(){

    }
    public VendingMachines(Integer code, Integer capacity){
        this.capacity=capacity;
        String kode = String.valueOf(code);
        this.code=kode;
    }
    public VendingMachines(Integer code, Integer capacity, Goods goods, double[] acceptanceBalance){
        String kode = String.valueOf(code);
        this.code=kode;
    }
    public void proceedOrder(String goodsCode, Integer orderQuantity){
        this.goods=goodsCode;
    }
    public static void takeMoney(double money){

    }
    private static void giveGood(double goodPrice, String goodsName){

    }
    public double withdrawMoney(){

    }
    public static void inputGoods(Goods goods){

    }
}
