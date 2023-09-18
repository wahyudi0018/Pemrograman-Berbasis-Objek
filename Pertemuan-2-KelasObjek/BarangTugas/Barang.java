package BarangTugas;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - (diskon / 100 * hargaDasar));
        return hargaJual;
    }

    public void tampilData() {
        int hargaJual = hitungHargaJual();
        System.out.println("Kode                 : " + kode);
        System.out.println("Nama Barang          : " + namaBarang);
        System.out.println("Harga Dasar (Rupiah) : " + hargaDasar + " Rupiah");
        System.out.println("Diskon (%)           : " + diskon + "%");
        System.out.println("Harga Jual (Rupiah)  : " + hargaJual + " Rupiah");

    }
}
