import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operasi operasi = new Operasi();
        String opsi;
        do {
            System.out.print("Masukkan Operasi Yang Ingin Dilakukan(Pertambahan/Pengurangan/Perkalian/Pembagian) : ");
            String Operasi = input.next();
            if (Operasi.equalsIgnoreCase("Pertambahan")) {
                operasi.inputan();
                operasi.tambah();
                System.out.print("Apakah ingin mengulang perhitungan(Y/N) : ");
                opsi = input.next();
            } else if (Operasi.equalsIgnoreCase("Pengurangan")) {
                operasi.inputan();
                operasi.kurang();
                System.out.print("Apakah ingin mengulang perhitungan(Y/N) : ");
                opsi = input.next();
                if (opsi.equalsIgnoreCase("N")) {
                    System.out.println("Perhitungan selesai, Terimakasih");
                }
            } else if (Operasi.equalsIgnoreCase("Perkalian")) {
                operasi.inputan();
                operasi.kali();
                System.out.print("Apakah ingin mengulang perhitungan(Y/N) : ");
                opsi = input.next();
                if (opsi.equalsIgnoreCase("N")) {
                    System.out.println("Perhitungan selesai, Terimakasih");}
                } else if (Operasi.equalsIgnoreCase("Pembagian")) {
                    operasi.inputan();
                    operasi.bagi();
                    System.out.print("Apakah ingin mengulang perhitungan(Y/N) : ");
                    opsi = input.next();
                    if (opsi.equalsIgnoreCase("N")) {
                        System.out.println("Perhitungan selesai, Terimakasih");}
                } else {
                    System.out.println("Operasi yang dimasukkan INVALID");
                    System.out.print("Apakah ingin mengulang perhitungan(Y/N) : ");
                    opsi = input.nextLine();
                    if (opsi.equalsIgnoreCase("N")) {
                        System.out.println("Perhitungan selesai, Terimakasih");}
                        }
                    }
                    while (opsi.equalsIgnoreCase("Y")) ;


                }
            }

