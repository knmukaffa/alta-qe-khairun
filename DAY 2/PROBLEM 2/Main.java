import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nilaiHuruf = "";
        System.out.print("Masukkan Nilai Angka : ");
        int nilaiAngka = input.nextInt();

        if(nilaiAngka>= 80 && nilaiAngka<= 100){
            nilaiHuruf = "A";
        } else if (nilaiAngka>= 65 && nilaiAngka<= 79) {
            nilaiHuruf = "B+";
        } else if (nilaiAngka>= 50 && nilaiAngka<= 64) {
            nilaiHuruf = "B";
        } else if (nilaiAngka>= 50 && nilaiAngka<= 64) {
            nilaiHuruf = "B";
        } else if (nilaiAngka>= 35 && nilaiAngka<= 49) {
            nilaiHuruf = "C";
        } else if (nilaiAngka>= 0 && nilaiAngka<= 34) {
            nilaiHuruf = "D";
        } else {
            System.out.println("Data yang dimasukkan INVALID");
        }
        
        System.out.println("Nilai Huruf anda adalah : " + nilaiHuruf);

    }
}