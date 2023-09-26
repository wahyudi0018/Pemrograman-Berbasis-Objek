package wahyudi.relasiclass.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("12345", "Mr. Krab");
        Penumpang p2 = new Penumpang("67890", "Spongebob Squarepants");
        Penumpang p3 = new Penumpang("54321", "Patrik Star");

        Pilot pilot = new Pilot("P001", "Captain Hook");

        Pesawat pesawat = new Pesawat("PT001", 3, pilot);
        pesawat.tambahPenumpang(p1, 1, 1);
        pesawat.tambahPenumpang(p3, 1, 1);
        pesawat.tambahPenumpang(p2, 1, 3);

        System.out.println(pesawat.info());
    }
}
