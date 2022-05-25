package com.ug12.projectkassa;
//NIM  : 71200595
//Nama : Gerry Sunjay Junjung
//Grup : D

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    private HashMap<Produk, Integer> pesanan = new HashMap<Produk, Integer>();
    private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
    private Kasir kasir;

    public Kassa(){

    }

    public void login(String username, String password){
        boolean ada = false;
        for (int i = 0; i < arrKasir.size(); i++)
        {
            if(arrKasir.get(i).getUsername()==username && arrKasir.get(i).getPassword()==password) {
                ada = true;
                this.kasir = arrKasir.get(i);
            }
        }
        if (ada == false){
            System.out.println("Username/password anda salah!");
        }else if (ada == true){
            System.out.println("Berhasil login!");
        }
    }

    public void register(Kasir kasir){
        this.arrKasir.add(kasir);
        System.out.println("Kasir " + kasir.getNama() + " berhasil ditambahkan ke dalam sistem.");
    }

    public void tambahPesanan(Produk produk, int jumlah){
        this.pesanan.put(produk,jumlah);
    }

    public void printNota(){
        System.out.println("Kasir: " + this.kasir.getNama());
        System.out.println("No. Nama Barang   Jumlah   Harga   Sub Total");
        int total = 0;
        int x = 1;
        for(Produk i : this.pesanan.keySet()) {
            int sub = (int) (i.getHarga() * this.pesanan.get(i));
            total += sub;
            System.out.println(x + ".  " + i.getNama() + "   " + this.pesanan.get(i) + "x" + "   " + i.getHarga() + "   " + sub);
            x += 1;
        }
        this.kasir.setTotalPenjualan(total);
        System.out.println("Total: Rp" + total);
        this.pesanan.clear();
    }

    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir");
        System.out.println("No. Nama                Total Penjualan");
        for (Kasir str:arrKasir){
            int i = 1;
            System.out.println(i+".  " + str.getNama()+"      Rp"+ str.getTotalPenjualan());
            i += 1;
        }
    }

}
