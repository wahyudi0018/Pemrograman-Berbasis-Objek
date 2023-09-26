package wahyudi.relasiclass.Tugas;

public class Pesawat {
    private String nomorPenerbangan;
    private Seat[] arraySeat;
    private Pilot pilot;

    public Pesawat(String nomorPenerbangan, int jumlahSeat, Pilot pilot) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.arraySeat = new Seat[jumlahSeat];
        this.pilot = pilot;
        this.initSeat();
    }

    private void initSeat() {
        for (int i = 0; i < arraySeat.length; i++) {
            this.arraySeat[i] = new Seat("S" + (i + 1), 10);
        }
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public Seat[] getArraySeat() {
        return arraySeat;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setNomorPenerbangan(String nomorBaru) {
        nomorPenerbangan = nomorBaru;
    }

    public void tambahPenumpang(Penumpang penumpang, int nomorSeat, int nomorKursi) {
        Seat seat = this.arraySeat[nomorSeat - 1];
        Kursi kursi = seat.getKursi(nomorKursi);

        if (kursi.getPenumpang() != null) {
            System.out.println("Kursi " + nomorKursi + " di " + seat.getKode() + " sudah terisi.");
        } else {
            kursi.setPenumpang(penumpang);
            System.out.println("Penumpang " + penumpang.getNama() + " telah ditempatkan di kursi " + nomorKursi + " di "
                    + seat.getKode() + ".");
        }
    }

    public String info() {
        String info = "Nomor Penerbangan: " + nomorPenerbangan + "\n";
        info += "Pilot: " + pilot.info() + "\n";
        for (Seat seat : arraySeat) {
            info += seat.info();
        }
        return info;
    }
}
