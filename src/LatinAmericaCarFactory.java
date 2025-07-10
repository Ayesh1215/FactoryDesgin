public class LatinAmericaCarFactory implements CarFactory {
    public Car Sedan(){
        return null;
    }
    public Car Hatchback(){
        return null;
    }
    public Car Suvs(){
        return new Suvs();
    }
    public Car Evs(){
        return new Evs();
    }
}
