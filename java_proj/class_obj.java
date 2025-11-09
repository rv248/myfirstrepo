public class class_obj {
    public static void main(String[] args) {
    	System.out.println("Car is driving...in main function");
        Car myCar = new Car();   // Create object
        myCar.color = "Red";     // Assign value
        myCar.drive();           // Call method
    }
}


class Car {
    String color;
    void drive() {
        System.out.println("Car is driving...");
        System.out.println(color);
        
    }
}
