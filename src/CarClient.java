public class CarClient {
    private CarFactory carFactory;

    public CarClient(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
    public void Car(String str) {
        Car car = null;
        if (str.equals("sedan")) {
            car = carFactory.Sedan();
        } else if (str.equals("hatchback")) {
            car = carFactory.Hatchback();
        } else if (str.equals("suv")) {
            car = carFactory.Suvs();
        } else if (str.equals("ev")) {
            car = carFactory.Evs();
        } else {
            System.out.println("Unknown car type.");
        }

        if (car != null) {
            car.horn();
            car.accelerate(30);
            car.turnleft();
            car.applyBreak(10);
            car.turnRight();
        } else {
            System.out.println("This car type is not supported by the current factory.");
        }
    }

}
