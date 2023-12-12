package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VessalApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship("SSship","2000",150);
        System.out.println(ship1.vesselDetails());

        Ferry ferry1= new Ferry("SSship","2000",150,200);
        System.out.println(ferry1.vesselDetails());

        Trawler trawler1= new Trawler("SSship","2000",150,200);
        System.out.println(trawler1.vesselDetails());

    }
}