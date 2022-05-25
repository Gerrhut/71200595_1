package com.ug12.projectkassa;
//NIM  : 71200595
//Nama : Gerry Sunjay Junjung
//Grup : D

public class Kasir {
    private String password;
    private long totalPenjualan;
    private String username;
    private String nama;

    public Kasir (String nama, String username, String password){
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public void setTotalPenjualan(long totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }
}
