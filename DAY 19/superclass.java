class Vehicle {
  void Type() {
      System.out.println("This is a vehicle");
  }
}

class Car extends Vehicle {
  void Brand() {
      System.out.println("This car is a AUDI");
  }
}
public class superclass {
  public static void main(String[] args) {
      Car myCar = new Car();
      myCar.Type();
      myCar.Brand();
  }
}