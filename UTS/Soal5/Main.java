package Soal5;

public class Main {
    public static void main(String[] args) {

        // Instansiasi objek
        Penulis ms = new Penulis();
        Buku yn = new Buku();

        // Mengisi objek
        ms.setNama("Makoto Shinkai");
        ms.setAlamat("Kuomi");
        yn.setISBN("978-4-09-189808-0");
        yn.setJudul("Your Name");
        yn.setPenulis(ms);
        yn.setHarga(120000);

        // Mencetak objek
        System.out.println("ISBN: " + yn.getISBN());
        System.out.println("Judul: " + yn.getJudul());
        System.out.println("Penulis: " + yn.getPenulis().getNama()); // Mengambil nama penulis
        System.out.println("Alamat Penulis: " + yn.getPenulis().getAlamat()); // Mengambil alamat penulis
        System.out.println("Harga: " + yn.getHarga());
    }
}
