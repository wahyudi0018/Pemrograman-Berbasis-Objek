package Inventaris;

public class Peminjaman {
    private Mahasiswa mahasiswa;
    private Barang barang;

    public Peminjaman(Mahasiswa mahasiswa, Barang barang) {
        this.mahasiswa = mahasiswa;
        this.barang = barang;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public String infoPeminjaman() {
        return "Informasi Peminjaman:\n" + mahasiswa.infoMahasiswa() + "\n" + barang.infoBarang();
    }
}
