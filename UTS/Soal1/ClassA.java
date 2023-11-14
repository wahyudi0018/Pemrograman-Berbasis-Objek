package Soal1;

public class ClassA {
    float f1 = 0.15f;

    float hitung() {
        float x = 2f * f1;
        // Mengembalikan nilai x
        return x;
    }

    public static void main(String[] args) {
        ClassA ca = new ClassA();
        System.out.println("nilai x: " + ca.hitung());
    }
}