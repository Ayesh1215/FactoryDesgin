public class FactoryMain {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        CarFactory na = new NorthAmericaCarFactory();
        CarClient naf = new CarClient(na);
        System.out.println("North America Client:");
        naf.Car("sedan");
        naf.Car("suv");

        CarFactory la = new LatinAmericaCarFactory();
        CarClient laf= new CarClient(la);
        System.out.println("\nLatin America Client:");
        laf.Car("suv");
        laf.Car("sedan");
    }
}