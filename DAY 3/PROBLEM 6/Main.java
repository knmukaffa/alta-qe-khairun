import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();

        kotak(angka);

    }

    public static void kotak(int angka) {
        int huruf = 1;
        for (int i = 1; i <= angka; i++) {
                System.out.print(isi(huruf) +" ");
                huruf++;
            }

            System.out.println();

            }


    public static char isi(int huruf){
    char result;
    if(huruf % 3 == 0){
        result = 'X';
    } else if (huruf % 2 == 0) {
        result = 'Z';
    } else {
        result = 'Y';
    }
    return result;
    }
 }