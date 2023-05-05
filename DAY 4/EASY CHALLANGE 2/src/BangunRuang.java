public class BangunRuang {

    double sisi;
    int panjang;
    int lebar;
    int tinggi;
    double jari;
    double tinggi2;

    public BangunRuang(double sisi, int panjang, int lebar, int tinggi, double jari, double tinggi2) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.jari = jari;
        this.tinggi2 = tinggi2;
    }

    public double volKubus (){
        return Math.pow(sisi,3);
    }
    public int volBal(){
        return panjang*lebar*tinggi;
    }
    public double volTab(){
        return Math.PI * Math.pow(jari,2) * tinggi2;
    }

}


