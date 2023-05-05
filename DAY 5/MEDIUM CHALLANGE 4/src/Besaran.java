import java.util.Scanner;

public class Besaran {

    double panjang;
    double lebar;
    double tinggi;
    double berat;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void masuk(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Barang : ");
        this.panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Barang : ");
        this.lebar = input.nextDouble();
        System.out.print("Masukkan Tinggi Barang : ");
        this.tinggi = input.nextDouble();
        System.out.print("Masukkan Berat Barang (Kg) : ");
        this.berat = input.nextDouble();
    }
}
