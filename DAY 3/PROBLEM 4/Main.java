import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan : ");
        int bilangan = input.nextInt();

        System.out.println(primeNumber(bilangan));

    }
    public static boolean primeNumber(int bilangan){

        if(bilangan == 1){
            return false;
        }

        for (int i=2; i < bilangan; i++){
            if (bilangan % i == 0){
                return false;
            }
        }
        return true;
    }
}