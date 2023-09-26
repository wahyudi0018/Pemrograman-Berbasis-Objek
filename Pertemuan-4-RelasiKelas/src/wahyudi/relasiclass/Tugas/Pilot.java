package wahyudi.relasiclass.Tugas;

public class Pilot {
    private String nomorLicense;
    private String nama;

    public Pilot(String nomorLicense, String nama) {
        this.nomorLicense = nomorLicense;
        this.nama = nama;
    }

    public String getNomorLicense() {
        return nomorLicense;
    }

    public String getNama() {
        return nama;
    }

    public void setNomorLicense(String nomorLicense) {
        this.nomorLicense = nomorLicense;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        return "\nNomor License: " + nomorLicense + "\nNama Pilot: " + nama + "\n";
    }
}
