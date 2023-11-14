package Tugas.Overriding;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("=============================");
        System.out.println("Class Manusia");
        manusia.bernafas();
        manusia.makan();
        System.out.println("=============================");

        System.out.println("Class Dosen");
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();
        System.out.println("=============================");

        System.out.println("Class Mahasiswa");
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
        System.out.println("=============================");
    }
}