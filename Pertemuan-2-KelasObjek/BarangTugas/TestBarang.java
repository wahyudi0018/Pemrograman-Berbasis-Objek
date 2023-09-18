package BarangTugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "AA";
        brg1.namaBarang = "Sari Roti";
        brg1.hargaDasar = 15000;
        brg1.diskon = 7.5F;
        brg1.tampilData();
    }
}
