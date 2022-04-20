package OOP.abstract;

public abstract class vehicle {

    String typr, model;

    //constractor
    public vehicle (String type, String model){
        this.type = type;
        this.model = model;

    }

    //non-abostract method
    public void start(){
        System.out.println("Vehicle has started.");
    }
    public void stop(){
        System.out.println("Vehicle has stopped,");
    }


    //abostract method

    public abstract int getMaxSpeed();
    
}
