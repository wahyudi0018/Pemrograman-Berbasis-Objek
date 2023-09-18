package PeminjamanGame;

public class PeminjamanGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;

    public int totalHarga() {
        return lamaSewa * harga;
    }

    public void tampilBiodata() {
        System.out.println("ID                   : " + id);
        System.out.println("Nama Member          : " + namaMember);
        System.out.println("Nama Game            : " + namaGame);
        System.out.println("Lama Sewa (hari)     : " + lamaSewa + " hari");
        System.out.println("Total Harga (rupiah) : " + totalHarga() + " Rupiah");
    }
}
