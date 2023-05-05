import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi Persegi : ");
        int sisi = input.nextInt();
        System.out.print("Masukkan Alas Segitiga : ");
        int alas = input.nextInt();
        System.out.print("Masukkan Tinggi Segitiga : ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang : ");
        int lebar = input.nextInt();
        System.out.print("Masukkan Panjang Persegi Panjang : ");
        int panjang = input.nextInt();



        BangunDatar itung = new BangunDatar(sisi,panjang,lebar,alas,tinggi);
        System.out.println();

        System.out.println("LUAS");
        System.out.println("PERSEGI : " + itung.luasPersegi());
        System.out.println("SEGITIGA : " + itung.luasSegitiga());
        System.out.println("PERSEGI PANJANG : " + itung.luasPPanjang());

        System.out.println();

        System.out.println("KELILING");
        System.out.println("PERSEGI : " + itung.kelPersegi());
        System.out.println("SEGITIGA : " + itung.kelSgt());
        System.out.println("PERSEGI PANJANG : " + itung.kelPPanjang());

    }
}