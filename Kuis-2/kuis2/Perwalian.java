package kuis2;

import java.util.ArrayList;
import java.util.List;

public class Perwalian {
    // Daftar mahasiswa dan matakuliah disimpan dalam ArrayList
    private List<Mahasiswa> mahasiswa;
    private List<MataKuliah> matakuliah;

    // Konstruktor untuk inisialisasi ArrayList mahasiswa dan matakuliah
    public Perwalian() {
        mahasiswa = new ArrayList<>();
        matakuliah = new ArrayList<>();
    }

    // Menambahkan objek Mahasiswa ke dalam ArrayList mahasiswa
    public void tambah_mahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa.add(mahasiswa);
    }

    // Menambahkan objek MataKuliah ke dalam ArrayList matakuliah
    public void tambah_matakuliah(MataKuliah matakuliah) {
        this.matakuliah.add(matakuliah);
    }

    // Menampilkan data mahasiswa beserta mata kuliah yang diambil
    public void cetakData_mahasiswa() {
        for (Mahasiswa m : mahasiswa) { // Mengakses setiap data mahasiswa dalam array mahasiswa
            System.out.println("Nama: " + m.getNama()); // Menampilkan nama mahasiswa
            System.out.println("NIM: " + m.getNim()); // Menampilkan NIM mahasiswa
            System.out.println("IPK: " + m.hitung_ipk()); // Menampilkan IPK mahasiswa
            System.out.println("Mata kuliah yang diambil:");
            for (MataKuliah mk : matakuliah) { // Mengakses setiap data mata kuliah dalam array mata kuliah
                System.out.println("* " + mk.getNama_matakuliah() + " (SKS: " + mk.getSks() + ")"); // Menampilkan mata
                                                                                                    // kuliah dan jumlah
                                                                                                    // SKS
            }
            System.out.println();
        }
    }

    // Menampilkan data mata kuliah beserta bobot mata kuliah
    public void cetakData_mataKuliah() {
        System.out.println("Bobot Mata kuliah:");
        for (MataKuliah mk : matakuliah) { // Mengakses setiap data mata kuliah dalam array mata kuliah
            System.out.println("* Nama Mata Kuliah: " + mk.getNama_matakuliah()); // Menampilkan nama mata kuliah
            System.out.println("  SKS: " + mk.getSks()); // Menampilkan jumlah SKS mata kuliah
            double[] nilai_mahasiswa = mk.getNilai_mahasiswa(); // Inisialisasi array nilai_mahasiswa dengan mendapatkan
                                                                // nilai mahasiswa
            System.out.print("  Nilai Mahasiswa: ");
            for (double nilai : nilai_mahasiswa) { // Mengakses setiap data mahasiswa dalam array mahasiswa
                System.out.print(nilai + " "); // Menampilkan nilai mahasiswa
            }
            System.out.println("\n  Bobot mata kuliah: " + mk.hitung_bobot()); // Menampilkan bobot mata kuliah
            System.out.println();
        }
    }
}
