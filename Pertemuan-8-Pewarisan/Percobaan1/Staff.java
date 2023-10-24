package Percobaan1;

public class Staff extends Karyawan {
    public int lembur, potongan;

    public Staff() {
    }

    public Staff(int lembur, int potongan, String nama, String alamat,
            String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur          = " + lembur);
        System.out.println("Potongan        = " + potongan);
        System.out.println("Total Gaji      = " + (gaji + lembur - potongan));
    }
}