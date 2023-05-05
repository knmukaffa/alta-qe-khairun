public class Operasi extends InputAngka{

    public  void tambah (){
        float hasil = this.angka1 + this.angka2;
        System.out.println("Hasil Pertambahan = "+hasil);
    }

    public  void kurang (){
        float hasil = this.angka1 - this.angka2;
        System.out.println("Hasil Pengurangan = "+hasil);
    }

    public  void kali (){
        float hasil = this.angka1 * this.angka2;
        System.out.println("Hasil Perkalian = "+hasil);
    }
    public  void bagi (){
        float hasil = this.angka1 / this.angka2;
        System.out.println("Hasil Pembagian = "+hasil);
    }
}
