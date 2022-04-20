import OOP.Car;

package OOP.abstract;

public class abstractTest {
    public static void main(String[] args) {
        //creating a Car object

        Car car = new Car('Car', 'Audi');
        car.start();
        car.stop();
        car.getMaxSpeed();
    }
    
}
