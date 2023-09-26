package wahyudi.relasiclass.Tugas;

public class Seat {
    private String kode;
    private Kursi[] arrayKursi;

    public Seat(String kode, int jumlahKursi) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlahKursi];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi("K" + (i + 1));
        }
    }

    public String getKode() {
        return kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public Kursi getKursi(int nomorKursi) {
        if (nomorKursi >= 1 && nomorKursi <= arrayKursi.length) {
            return arrayKursi[nomorKursi - 1];
        } else {
            throw new IllegalArgumentException("Nomor kursi tidak valid");
        }
    }

    public void setKode(String kodeBaru) {
        kode = kodeBaru;
    }

    public String info() {
        String info = "Seat " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}