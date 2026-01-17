public class driver {
 public static void main(String[] args) {
   //  Car myCar = new Car();
   //  myCar.drive();
   //  System.out.println(myCar.getCurrentFuel());
   //  myCar.addFuel(12.3f);
   //  System.out.println(myCar.getCurrentFuel());

    Car bmw = new Car();
      bmw.color = "Black";
      bmw.noOfWheels = 4;
      bmw.maxSpeed = 250.5f;
      bmw.currentFuelInLiters = 10.0f;
      bmw.noOfSeats = 5;
      bmw.model = "BMW X5";
      bmw.showDetails();
 }
}
