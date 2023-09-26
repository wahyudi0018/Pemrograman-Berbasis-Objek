package wahyudi.relasiclass.Tugas;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setNomor(String nomorBaru) {
        nomor = nomorBaru;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public String info() {
        String info = "Kursi " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        } else {
            info += "Kursi kosong\n";
        }
        return info;
    }
}