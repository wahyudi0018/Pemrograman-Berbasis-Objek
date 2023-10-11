package soal1;

public class PersegiPanjang extends BangunDatar {

    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }

    public void info() {
        System.out.println("\nLuas dan Keliling Persegi Panjang");
        System.out.println("---------------------------------");
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
        System.out.println("---------------------------------");
    }
}
