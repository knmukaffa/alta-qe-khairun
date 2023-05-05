import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String lagi;

        do {
            System.out.println("Pilih volume bangun ruang yang ingin dihitung(Kubus/Balok/Tabung) : ");
            String jenis = input.next();


            if(jenis.equalsIgnoreCase("Kubus")){
                System.out.print("Masukkan Sisi Kubus : ");
                double sisi = input.nextDouble();
                BangunRuang itungKubus = new BangunRuang(sisi,0,0,0,0,0);
                System.out.println("Volume Kubus = "+itungKubus.volKubus());
                System.out.println("Apakah ingin menghitung lagi(Y/N) : ");
                lagi = input.next();

            } else if (jenis.equalsIgnoreCase("Balok")) {
                System.out.print("Masukkan Panjang Balok : ");
                int panjang = input.nextInt();
                System.out.print("Masukkan Lebar Balok : ");
                int lebar = input.nextInt();
                System.out.print("Masukkan Tinggi Balok : ");
                int tinggi = input.nextInt();
                BangunRuang itungBalok = new BangunRuang(0,panjang,lebar,tinggi,0,0);
                System.out.println("Volume Balok = "+itungBalok.volBal());
                System.out.println("Apakah ingin menghitung lagi(Y/N) : ");
                lagi = input.next();

            } else if (jenis.equalsIgnoreCase("Tabung")) {
                System.out.print("Masukkan Jari-Jari Tabung : ");
                int jari = input.nextInt();
                System.out.print("Masukkan Tinggi Tabung : ");
                int tinggi2 = input.nextInt();
                BangunRuang itungTabung = new BangunRuang(0,0,0,0,jari,tinggi2);
                System.out.println("Volume Tabung = "+itungTabung.volTab());
                System.out.println("Apakah ingin menghitung lagi(Y/N) : ");
                lagi = input.next();

            } else {
                System.out.println("Jenis Bangun Ruang yang dimasukkan INVALID");
                System.out.println("Apakah ingin menghitung lagi(Y/N) : ");
                lagi = input.next();
            }
        }while (lagi.equalsIgnoreCase("Y"));

    }
}