// import java.nio.channels.Pipe.SourceChannel;

class Car {
    //instance variables;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // instance methods
    public void drive(){
        System.out.println("Car is being driven");
        if (currentFuelInLiters == 0) { 
            System.out.println("Please Fill Tank, Out of Fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in Reserved Mode Please Fuel Up");
            currentFuelInLiters--;
        } else{
            currentFuelInLiters--;
        }
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuel(){
        return currentFuelInLiters;
    }
}