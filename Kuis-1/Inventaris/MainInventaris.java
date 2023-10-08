package Inventaris;

public class MainInventaris {
    public static void main(String[] args) {
        // Membuat beberapa instance Mahasiswa dan Barang
        Mahasiswa wahyudi = new Mahasiswa("1", "Wahyudi", "123456");

        Barang barang1 = new Barang(101, "Proyektor", 5);

        // Melakukan peminjaman barang oleh mahasiswa
        Peminjaman peminjaman1 = new Peminjaman(wahyudi, barang1);

        // Menampilkan informasi mahasiswa beserta barang yang dipinjam
        System.out.println(peminjaman1.infoPeminjaman());
    }
}
