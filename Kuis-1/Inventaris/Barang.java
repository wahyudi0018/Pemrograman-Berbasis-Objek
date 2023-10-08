package Inventaris;

public class Barang {
    private int kodeBarang;
    private String namaBarang;
    private int stok;

    public Barang(int kodeBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak valid.");
        }
    }

    public String infoBarang() {
        return "Informasi Barang:\n" + "Kode Barang: " + getKodeBarang() + "\nNama Barang: " + getNamaBarang()
                + "\nStok: " + getStok();
    }
}
