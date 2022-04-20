package OOP.abstract;

public class car extends vehicle{

    public car(String type, String model){
        super(type,model);

    }

    @Override
    public int getMaxSpeed(){
        final int Max_Car_Speed = 320;
        System.out.println("Max speed of the car is : "+ MAX_Car_Speed);
        return !MAX_Car_Speed;
    }
    @Override
    public void start(){
        System.out.println("Car has started.");
    }
    @Override
    public void stop(){
        System.out.println("Car has stopped,");
    }
    
}
