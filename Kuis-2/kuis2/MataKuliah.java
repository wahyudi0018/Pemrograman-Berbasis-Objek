package kuis2;

public class MataKuliah {
    // Inisialisasi atribut nama_matakuliah, sks, dan nilai_mahasiswa
    private String nama_matakuliah;
    private int sks;
    private double[] nilai_mahasiswa;

    // Konstruktor untuk inisialisasi objek MataKuliah
    MataKuliah(String nama_matakuliah, int sks, double[] nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    // Metode getter untuk mendapatkan nama mata kuliah
    public String getNama_matakuliah() {
        return nama_matakuliah;
    }

    // Metode setter untuk mengubah nama mata kuliah
    public void setNama_matakuliah(String nama_matakuliah) {
        this.nama_matakuliah = nama_matakuliah;
    }

    // Metode getter untuk mendapatkan jumlah SKS mata kuliah
    public double getSks() {
        return sks;
    }

    // Metode setter untuk mengubah jumlah SKS mata kuliah
    public void setSks(int sks) {
        this.sks = sks;
    }

    // Metode getter untuk mendapatkan nilai mahasiswa
    public double[] getNilai_mahasiswa() {
        return nilai_mahasiswa;
    }

    // Metode setter untuk mengubah nilai mahasiswa
    public void setNilai_mahasiswa(double[] nilai_mahasiswa) {
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    // Metode untuk menghitung bobot berdasarkan rata-rata nilai mahasiswa
    public double hitung_bobot() {
        double nilai_rata_rata = 0; // Pemberian nilai awal nilai_rata_rata

        for (double n : nilai_mahasiswa) { // Mengakses setiap nilai dalam array nilai
            nilai_rata_rata += n; // Menambahkan setiap nilai ke dalam nilai_rata_rata
        }

        nilai_rata_rata /= nilai_mahasiswa.length; // Menghitung rata-rata nilai

        if (nilai_rata_rata >= 77) { // Menentukan bobot berdasarkan rata-rata nilai mahasiswa
            return 2.0;
        } else {
            return 3.0;
        }
    }

    // Metode untuk menghitung bobot berdasarkan nilai mahasiswa dengan bobot
    // tertentu
    public double hitung_bobot(double[] bobot_mahasiswa) {
        double bobot_nilai = 0; // Pemberian nilai awal bobot_nilai

        for (int i = 0; i < nilai_mahasiswa.length; i++) { // Mengakses setiap nilai dan bobot yang sesuai
            bobot_nilai += nilai_mahasiswa[i] * bobot_mahasiswa[i]; // Setiap nilai dikali dengan bobot yang sesuai dan
                                                                    // ditambahkan ke dalam bobot_nilai
        }

        bobot_nilai /= nilai_mahasiswa.length; // Menghitung rata-rata nilai

        if (bobot_nilai >= 77) { // Menentukan bobot berdasarkan nilai mahasiswa dengan bobot tertentu
            return 2.0;
        } else {
            return 3.0;
        }
    }
}
