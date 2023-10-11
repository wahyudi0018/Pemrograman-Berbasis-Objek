package soal1;

public class Lingkaran extends BangunDatar {
    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) Math.PI * r * r;
    }

    @Override
    public float keliling() {
        return 2 * (float) Math.PI * r;
    }

    public void info() {
        System.out.println("\n  Luas dan Keliling Lingkaran  ");
        System.out.println("---------------------------------");
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
        System.out.println("---------------------------------");
    }
}
