package Lingkaran;

public class Lingkaran {
    public double phi;
    public double r;

    public void hitungLuas() {
        double luas = phi * (r * r);
        System.out.println("Luas Lingkaran (cm)     : " + luas + " cm");
    }

    public void hitungKeliling() {
        double keliling = 2 * phi * r;
        System.out.println("Keliling Lingkaran (cm) : " + keliling + " cm");
    }
}
