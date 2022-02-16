package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int inputan;
        Mobil M_71200595 = new Mobil();
        PejalanKaki P_71200595 = new PejalanKaki();
        Scanner a = new Scanner(System.in);
        System.out.println("Input lalu lintas");inputan = a.nextInt();


        if(inputan==1){
            System.out.println("Lampu Merah");
            M_71200595.jalan();
            P_71200595.menunggu();

        }else if(inputan==3){
            System.out.println("Lampu Hijau");
            M_71200595.berhenti();
            P_71200595.menyebrang();
        }else if(inputan==2){
            System.out.println("Lampu Kuning");
            M_71200595.kurangiKecepatan();
            P_71200595.bersiap();
        }
    }
}
