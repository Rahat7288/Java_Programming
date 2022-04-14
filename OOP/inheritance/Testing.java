package OOP.inheritance;

public class Testing {
    public static void main(String[] args) {
        //car object
        Car car = new Car();
        car.type = "car";
        car.model = "Audi";
        car.maxSpeed = 400;
        car.print();
        //
        //bike object

        Motorcycle motor = new Motorcycle();
        motor.type = "motorcycle";
        motor.model = "Yamaha R15 V10";
        motor.maxSpeed = 1000;
        motor.print();
    }
    
}
