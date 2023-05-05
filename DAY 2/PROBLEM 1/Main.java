import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        float alas = input.nextFloat();
        System.out.print("Masukkan tinggi : ");
        float tinggi = input.nextFloat();
        float luasSegitiga = (alas * tinggi) / 2;

        System.out.println("Luas Segitiga adalah : " + luasSegitiga);

    }
}