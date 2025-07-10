public class Sedan implements Car {
    private int speed = 0;
    @Override
    public void spec() {
        System.out.println("Assembling in north America");
    }
    @Override
    public void horn() {
        System.out.println("horn");

    }
    @Override
    public int accelerate(int speedUnits) {
        speed+=speedUnits;
        System.out.println("sedan speedUnits"+speed);
        return speed;
    }
    @Override
    public int applyBreak(int reduceSpeedUnit) {
        speed=speed-reduceSpeedUnit;
        if(speed<0) {
            speed = 0;
        }
        System.out.println("sedan Reduce Speed Units"+speed);
        return speed;
    }
    @Override
    public void turnleft() {
        System.out.println("Take the Trun left");

    }
    @Override
    public void turnRight() {
        System.out.println("Take the Turn Right");

    }
}
