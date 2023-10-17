package Tugas;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarGaji daftarGaji = new DaftarGaji();

        while (true) {
            System.out.println();
            System.out.println("*******************************");
            System.out.println("Menu:");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Tampilkan Gaji Pegawai");
            System.out.println("3. Keluar");
            System.out.println("*******************************");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("*******************************");
                    System.out.println("Masukkan data Dosen:");
                    System.out.print("NIP: ");
                    String nip = input.next();
                    System.out.print("Nama: ");
                    String nama = input.next();
                    input.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = input.next();
                    Dosen dosen = new Dosen(nip, nama, alamat);

                    System.out.print("Jumlah SKS: ");
                    int sks = input.nextInt();
                    dosen.setSKS(sks);
                    System.out.print("Tarif SKS: ");
                    int tarif = input.nextInt();
                    dosen.setTarif(tarif);

                    daftarGaji.addPegawai(dosen);
                    System.out.println("Dosen ditambahkan!");
                    break;

                case 2:
                    System.out.println();
                    System.out.println();
                    System.out.println("Daftar Gaji Pegawai:");
                    daftarGaji.printSemuaGaji();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);

                default:
                    System.out.println("*******************************");
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    System.out.println("*******************************");
            }
        }
    }
}
