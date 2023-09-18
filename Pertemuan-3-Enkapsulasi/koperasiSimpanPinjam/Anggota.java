package koperasiSimpanPinjam;

public class Anggota {
    private String noKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    Anggota(String noKTP, String nama, double limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double uang) {
        if (uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }

    public void angsur(double uang) {
        double minAngsur = 0.1 * jumlahPinjaman;
        if (uang > jumlahPinjaman) {
            System.out.println("Maaf, jumlah angsuran melebihi limit.");
        } else {
            if (uang >= minAngsur) {
                jumlahPinjaman -= uang;
            } else {
                System.out.println("Maaf, angsuran harus 10% atau lebih dari jumlah pinjaman.");
            }
        }
    }
}
