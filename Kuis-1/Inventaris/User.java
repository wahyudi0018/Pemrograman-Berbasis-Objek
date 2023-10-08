package Inventaris;

public class User {
    private String kodeUser;
    private String namaUser;

    public User(String kodeUser, String namaUser) {
        this.kodeUser = kodeUser;
        this.namaUser = namaUser;
    }

    public String getKodeUser() {
        return kodeUser;
    }

    public void setKodeUser(String kodeUser) {
        this.kodeUser = kodeUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }
}