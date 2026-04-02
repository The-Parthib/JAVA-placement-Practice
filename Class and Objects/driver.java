public class driver {

  static int age;
  
  public boolean isAllowedToDrive(){
    return age >= 18;
  }
  
  String name;


 public static void main(String[] args) {
   //  Car myCar = new Car();
   //  myCar.drive();
   //  System.out.println(myCar.getCurrentFuel());
   //  myCar.addFuel(12.3f);
   //  System.out.println(myCar.getCurrentFuel());

   /* 
      Car bmw = new Car();
      bmw.color = "Black";
      bmw.noOfWheels = 4;
      bmw.maxSpeed = 250.5f;
      bmw.currentFuelInLiters = 10.0f;
      bmw.noOfSeats = 5;
      bmw.model = "BMW X5";
      bmw.showDetails();

      Car audi = new Car();
      audi.color = "White";
      audi.noOfWheels = 4;
      audi.maxSpeed = 240.0f;
      audi.currentFuelInLiters = 8.0f;
      audi.noOfSeats = 5;
      audi.model = "Audi Q7";
      audi.showDetails();
      */

      Car swift = new Car();
      swift.addFuel(6);
      swift.start().drive();

      driver d = new driver();
      age = 21;
      d.name = "Riju";
      System.out.println(age + " " + d.name);
 }
}
