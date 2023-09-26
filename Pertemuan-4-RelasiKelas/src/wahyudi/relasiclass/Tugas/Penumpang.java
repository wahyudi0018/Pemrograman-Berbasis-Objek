package wahyudi.relasiclass.Tugas;

public class Penumpang {
    private String nomorKTP;
    private String nama;

    public Penumpang(String nomorKTP, String nama) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNomorKTP(String nomorKTPBaru) {
        nomorKTP = nomorKTPBaru;
    }

    public void setNama(String namaBaru) {
        nama = namaBaru;
    }

    public String info() {
        return "\nNomor KTP: " + nomorKTP + "\nNama: " + nama + "\n";
    }
}
