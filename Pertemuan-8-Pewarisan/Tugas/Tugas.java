package Tugas;

public class Tugas {
    public static void main(String args[]) {

        System.out.println("=======================KOMPUTER========================");
        Komputer k = new Komputer("Dell", "Intel Core i7", 1800, 16);
        k.tampilData();

        System.out.println("=========================LAPTOP========================");
        Leptop l = new Leptop("Lithium Ion 8000 MAh", "HP", "Intel Core I7", 2500, 16);
        l.tampilLeptop();

        System.out.println("==========================PC===========================");
        Pc p = new Pc(32, "Acer", "Intel Core i9", 8000, 16);
        p.tampilPc();

        System.out.println("==========================MAC==========================");
        Mac m = new Mac("Face ID", "Lithium Ion 6000 MAh", "Macbook Pro", "Apple M2 Pro", 3500, 16);
        m.tampilMac();

        System.out.println("========================WINDOWS========================");
        Windows w = new Windows("Ray Tracing", "Lithium Ion 7000 MAh", "HP", "Intel Core I9", 2800, 16);
        w.tampilWindows();
    }
}
