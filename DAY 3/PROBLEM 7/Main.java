import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan total panjang array : ");
        int panjang = input.nextInt();

        System.out.println("Hasilnya adalh : "+mean(panjang));

    }
    public static float mean(int panjang){
        Scanner input = new Scanner(System.in);
        int array[] = new int[panjang];
        float jumlah = 0;
        float hasil =0;

        for (int i = 0; i <= panjang-1;i++){
            System.out.println("Masukkan angka ke - "+(i+1));
            array[i]= input.nextInt();
        }

        for (int i = 0; i <= panjang-1;i++){
            jumlah = jumlah +array [i];
        }
        return hasil = jumlah /array.length;
    }
}