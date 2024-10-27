package polymorfisme;

public class Persegi  extends BangunDatar{
    private double sisi;

    @Override
    public double keliling() {
        return 4 * this.sisi;
    }

    @Override
    public double luas() {
        return sisi * this.sisi;
    }

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
}
