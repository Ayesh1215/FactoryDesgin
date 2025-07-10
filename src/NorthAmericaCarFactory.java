public class NorthAmericaCarFactory implements CarFactory {
    public Car Sedan(){
        return new Sedan();
    }
    public Car Hatchback(){
        return new Hatchback();
    }
    public Car Suvs(){
        return null;
    }
    public Car Evs(){
        return null;
    }
}
