package MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    private boolean kontakOn = false;
    private int kecepatan_max = 100;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void MatikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan + 5 <= kecepatan_max) {
                kecepatan += 5;
            } else {
                kecepatan = kecepatan_max;
                System.out.println("Kecepatan maksimal tercapai!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}