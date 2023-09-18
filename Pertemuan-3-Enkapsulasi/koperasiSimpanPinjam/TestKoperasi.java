package koperasiSimpanPinjam;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner wahyudi = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        boolean ulangi = true;

        while (ulangi) {
            System.out.print("\nMenu: \n1. Pinjam \n2. Angsur \n3. Keluar \nPilih menu: ");
            int menu = wahyudi.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("\nMasukkan jumlah peminjaman: ");
                    double pinjaman = wahyudi.nextDouble();
                    donny.pinjam(pinjaman);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("\nMasukkan jumlah angsuran: ");
                    double angsuran = wahyudi.nextDouble();
                    donny.angsur(angsuran);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 3:
                    ulangi = false;
                    System.out.println("Terima kasih telah menggunakan layanan Koperasi Simpan Pinjam!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }

        wahyudi.close();
    }
}
