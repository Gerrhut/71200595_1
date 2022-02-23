import java.util.Scanner;
public class UG3soal1 {
    public static void main(String[]args){
        float Jumlah,Berat;
        String Makanan,Tanggal;
        System.out.println("=================Data Product=================");
        System.out.println("Masukkan Data Product Makanann Anda");
        Scanner a = new Scanner(System.in);
        System.out.println("Nama Makanan:"); Makanan=a.nextLine();
        System.out.println("Tanggal Kadaluarsa:"); Tanggal=a.nextLine();
        System.out.println("Jumlah (quantity):"); Jumlah=a.nextFloat();
        System.out.println("Berat (gram):"); Berat = a.nextFloat();
        System.out.println("=================Data Product=================");
        System.out.print("Nama makanan = ");
        System.out.println(Makanan);
        System.out.print("Tanggal Kadaluarsa = ");
        System.out.println(Tanggal);
        System.out.print("Jumlah (quantity) = ");
        System.out.println(Jumlah);
        System.out.print("Berat = ");
        System.out.println(Berat);
        System.out.println("===============================================");
    }
}
