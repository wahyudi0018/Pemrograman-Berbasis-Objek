package soal1;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public float keliling() {
        return alas + 2 * tinggi;
    }

    public void info() {
        System.out.println("\n  Luas dan Keliling Segitiga   ");
        System.out.println("---------------------------------");
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
        System.out.println("---------------------------------");
    }
}
