public class BangunDatar {

    int sisi;
    int panjang;
    int lebar;
    double alas;
    double tinggi;

    public BangunDatar(int sisi, int panjang, int lebar, int alas, int tinggi) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int luasPersegi(){
        return sisi * sisi;
    }
    public int luasPPanjang(){
        return panjang * lebar;
    }
    public double luasSegitiga(){
        return alas*tinggi/2;
    }

    public int kelPersegi(){
        return sisi * 4;
    }
    public  int kelPPanjang(){
        return (panjang + lebar)*2;
    }
    public double kelSgt(){
        double sisi = Math.pow(alas/2,2) + Math.pow(tinggi,2);
        double hasilSisi = Math.sqrt(sisi);
        return hasilSisi * 3;
    }

}
