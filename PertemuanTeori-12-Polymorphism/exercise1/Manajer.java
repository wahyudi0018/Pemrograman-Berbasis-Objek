package exercise1;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super.nama = nama;
        super.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public int getTunjangan() {
        return this.tunjangan;
    }
}