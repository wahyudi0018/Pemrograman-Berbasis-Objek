package Soal4;

public class Mahasiswa {
    String nim, nama, alamat;
    char jeniskelamin;

    // construtor class Mahasiswa
    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jeniskelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        // Instansiasi objek wahyudi
        Mahasiswa wahyudi = new Mahasiswa("2241720018", "Wahyudi", "Jl. MT. Haryono No. 103", 'L');

        // Mencetak objek wahyudi
        System.out.println("NIM: " + wahyudi.nim);
        System.out.println("Nama: " + wahyudi.nama);
        System.out.println("Alamat: " + wahyudi.alamat);
        System.out.println("Jenis Kelamin: " + wahyudi.jeniskelamin);
    }
}
