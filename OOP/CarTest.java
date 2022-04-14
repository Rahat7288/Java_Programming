package OOP;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("audi");

        myCar.start();
        myCar.accelerate();
        myCar.showSpeed();
        myCar.stop();
        myCar.showSpeed();

        Car myCar1 = new Car("BMW", "white", 2022);
        System.out.print(myCar1);

    }
    
}
