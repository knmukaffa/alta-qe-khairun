import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TotalOngkir itung = new TotalOngkir();
        String opsi;

        do {
            itung.masuk();
            itung.itungOngkir();
            System.out.print("Apakah ingin menghitung lagi?(Y/N) : ");
            opsi = input.next();
            if (opsi.equalsIgnoreCase("N")){
                System.out.println("Terimakasih");
            }
        } while (opsi.equalsIgnoreCase("Y"));

    }
}