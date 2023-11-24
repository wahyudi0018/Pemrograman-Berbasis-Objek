package exercise1;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super.nama = nama;
        super.gaji = gaji;
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return super.gaji;
    }

    public int getBonus() {
        return this.bonus;
    }
}