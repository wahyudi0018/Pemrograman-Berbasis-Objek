package Tugas.Overloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Segitiga objek = new Segitiga();

        // metode totalSudut()
        System.out.println("Metode menghitung sudut 1");
        System.out.println("Sudut    : " + objek.totalSudut(60));
        System.out.println("Metode menghitung sudut 2");
        System.out.println("Sudut    : " + objek.totalSudut(45, 60));

        // metode keliling()
        System.out.println("Metode menghitung keliling 1");
        System.out.println("Keliling : " + objek.keliling(3, 4, 5));
        System.out.println("Metode menghitung keliling 2");
        System.out.println("Keliling : " + objek.keliling(3, 4));
    }

}
