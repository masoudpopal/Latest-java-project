package MasoudWahabFunClasses;

public class Mercedes extends Car implements Drivable{


    @Override
    public void start() {
        System.out.println("Mercedes can start");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes can drive");
    }
}
