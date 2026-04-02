// import java.nio.channels.Pipe.SourceChannel;

class Car {
    //instance variables;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    String model;
    static int key = 10;

    // instance methods
    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Please Fill Tank, Out of Fuel");
        }
        else if (currentFuelInLiters < 5) {
            System.out.println("Car is in Reserved Mode Please Fuel Up");
        } else {
            System.out.println("Car is Starting ... bruhmmm");
        }

        return this;
    }

    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is being driven");
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuel(){
        return currentFuelInLiters;
    }

    // instance methods
    public void showDetails(){
        System.out.println("Model of Car: " + model);
        System.out.println("Color of Car: " + color);
        System.out.println("No of Wheels: " + noOfWheels);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Current Fuel in Liters: " + currentFuelInLiters);
        System.out.println("No of Seats: " + noOfSeats);

    }
}