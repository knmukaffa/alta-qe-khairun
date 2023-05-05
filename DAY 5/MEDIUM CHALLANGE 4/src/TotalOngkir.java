public class TotalOngkir extends Besaran{
    double total;
    public void itungOngkir(){
        double volume = Math.round((this.panjang * this.lebar * this.tinggi) / 50);

        if (volume > Math.round(this.berat)){
            total = volume * 5000;
            System.out.println("Harga Ongkos Kirim = Rp."+total);

        } else if (volume < Math.round(this.berat)) {
            total = Math.round(this.berat) * 5000;
            System.out.println("Harga Ongkos Kirim = Rp."+total);

        } else if (volume == Math.round(this.berat)) {
            total = Math.round(this.berat) * 5000;
            System.out.println("Harga Ongkos Kirim = Rp."+total);
        }
    }

}
