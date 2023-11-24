package exercise2;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input: DVI");
            System.out.println("Voltase televisi: 220");
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi modern dengan input: HDMI");
            System.out.println("Voltase televisi: 220");
        }
    }
}
