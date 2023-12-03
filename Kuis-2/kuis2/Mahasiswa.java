package kuis2;

public class Mahasiswa {
    // Inisialisasi atribut nama, nim, dan nilai
    private String nama;
    private String nim;
    private double[] nilai;

    // Konstruktor untuk inisialisasi objek Mahasiswa
    Mahasiswa(String nama, String nim, double[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Metode untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Metode untuk mengubah nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk mendapatkan NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // Metode untuk mengubah NIM mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Metode untuk mendapatkan nilai mahasiswa
    public double[] getNilai() {
        return nilai;
    }

    // Metode untuk mengubah nilai mahasiswa
    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    // Metode untuk menghitung IPK tanpa memperhitungkan SKS mata kuliah
    public double hitung_ipk() {
        double total_nilai = 0; // Pemberian nilai awal total_nilai

        for (double n : nilai) { // Mengakses setiap nilai dalam array nilai
            total_nilai += n; // Menambahkan setiap nilai ke dalam total_nilai
        }

        return (total_nilai / nilai.length) / 25; // Menghitung rata-rata nilai dan mengonversi ke dalam skala 4
    }

    // Metode untuk menghitung IPK dengan memperhitungkan SKS mata kuliah
    public double hitung_ipk(double[] nilai_sks) {
        double total_nilai = 0; // Pemberian nilai awal total_nilai
        double total_sks = 0; // Pemberian nilai awal total_sks

        for (int i = 0; i < nilai.length; i++) { // Mengakses setiap nilai dan SKS yang sesuai
            total_nilai += nilai[i] * nilai_sks[i]; // Setiap nilai dikali dengan SKS yang sesuai dan ditambahkan ke
                                                    // dalam total_nilai
            total_sks += nilai_sks[i]; // SKS dari setiap mata kuliah ditambahkan ke dalam total_sks
        }

        return (total_nilai / total_sks) / 25; // Menghitung rata-rata nilai dengan memperhitungkan SKS dan mengonversi
                                               // ke dalam skala 4
    }
}
