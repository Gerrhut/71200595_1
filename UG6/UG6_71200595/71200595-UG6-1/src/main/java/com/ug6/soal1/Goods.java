package com.ug6.soal1;

public class Goods {
    private String code;
    private String name;
    private Integer Quantitiy;
    private double price;

    public Goods(){

    }
    public Goods(Integer code, String name){
        String kode = String.valueOf(code);
        this.code = kode;
        this.price= price;
    }
    public Goods(Integer code, String name, Integer quantity, double price){
        String kode=String.valueOf(code);
        this.code=kode;
        this.name=name;
        this.Quantitiy=quantity;
        this.price=price;
    }
}

