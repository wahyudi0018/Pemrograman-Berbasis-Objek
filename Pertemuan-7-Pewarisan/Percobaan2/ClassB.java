package Percobaan2;

public class ClassB extends ClassA {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void getNilaiZ() {
        System.out.println("nilai Z:" + getZ());
    }

    public void getJumlah() {
        System.out.println("jumlah:" + (getX() + getY() + getZ()));
    }
}