package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private int code;
    private int capacity;
    private int usedCapacity;
    private ArrayList goods;
    private ArrayList acceptanceBalance;
    private double consumerMoney;

    public VendingMachines(){
    }

    public VendingMachines (int code, int capacity){
        this.code = code;
        this.capacity = capacity;
    }

    public VendingMachines (int code, int capacity, Goods goods, double[] acceptanceBalance){
        this.code = code;
        this.capacity = capacity;
    }

    public void proceedOrder(String goodsCode, int orderQuantity){
        return giveGood();
    }

    public void takeMoney(double money){
    }

    public void giveGood(double goodsPrice, String goodsName){
    }

    public double withdrawMoney(){
        return withdrawMoney();
    }

    public void inputGoods(Goods good){
    }
}
