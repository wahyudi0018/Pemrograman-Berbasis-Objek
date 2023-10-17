package Percobaan2;

public class ClassA {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void getNilai() {
        System.out.println("nilai X:" + x);
        System.out.println("nilai Y:" + y);
    }
}
