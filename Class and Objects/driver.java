public class driver {
 public static void main(String[] args) {
    Car myCar = new Car();
    myCar.drive();
    System.out.println(myCar.getCurrentFuel());
    myCar.addFuel(12.3f);
    System.out.println(myCar.getCurrentFuel());
 }
}
