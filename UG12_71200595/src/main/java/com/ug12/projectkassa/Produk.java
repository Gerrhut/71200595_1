package com.ug12.projectkassa;
//NIM  : 71200595
//Nama : Gerry Sunjay Junjung
//Grup : D

public class Produk {
    private long harga;
    private String nama;

    public Produk(String nama, long harga){
        this.harga = harga;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }
}
