package polymorfisme;

public class Segitiga extends BangunDatar{
    private double sisi;
    private double tinggi;

    public Segitiga(final double sisi, final double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double keliling() {
        return 3 * sisi;
    }

    @Override
    public double luas() {
        return 0.5 * sisi * tinggi;
    }
}
