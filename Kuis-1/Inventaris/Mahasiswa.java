package Inventaris;

class Mahasiswa extends User {
    private String nim;

    public Mahasiswa(String kodeUser, String namaUser, String nim) {
        super(kodeUser, namaUser);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String infoMahasiswa() {
        return "Informasi Mahasiswa:\n" + "Kode User: " + getKodeUser() + "\nNama User: " + getNamaUser() + "\nNIM: "
                + nim;
    }
}
