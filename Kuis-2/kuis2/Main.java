package kuis2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Perwalian
        Perwalian perwalian = new Perwalian();

        // Membuat objek Mahasiswa dan menambahkannya ke perwalian
        Mahasiswa mhs1 = new Mahasiswa("Armin", "123456789", new double[] { 85, 75 });
        Mahasiswa mhs2 = new Mahasiswa("Arin", "987654321", new double[] { 90, 80 });
        perwalian.tambah_mahasiswa(mhs1);
        perwalian.tambah_mahasiswa(mhs2);

        // Membuat objek MataKuliah dan menambahkannya ke perwalian
        MataKuliah mk1 = new MataKuliah("Kecerdasan Artifisial", 2, new double[] { 85, 75 });
        MataKuliah mk2 = new MataKuliah("Pemrograman Berbasis Objek", 3, new double[] { 90, 80 });
        perwalian.tambah_matakuliah(mk1);
        perwalian.tambah_matakuliah(mk2);

        // Menampilkan data mahasiswa yang telah ditambahkan
        perwalian.cetakData_mahasiswa();

        // Menampilkan data mata kuliah yang telah ditambahkan
        perwalian.cetakData_mataKuliah();
    }
}
