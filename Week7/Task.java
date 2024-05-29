package Week7;
public class Task {

    static class Car {
        private String name;
        private String brand;
        private int year;
        private String color;

        public Car(String name, String brand, int year, String color) {
            this.name = name;
            this.brand = brand;
            this.year = year;
            this.color = color;
        }

        public void modify(String newColor) {
            this.color = newColor;
        }

        public int expiry() {
            return this.year + 100;
        }

        public void start() {
            System.out.println(this.name + " is starting");
        }

        public void stop() {
            System.out.println(this.name + ", " + this.brand + " is stopping");
        }

        public void detail() {
            System.out.println("Name: " + this.name + ", Brand: " + this.brand + ", Color: " + this.color + ", Year: " + this.year);
        }
    }

    public static void main(String[] args) {
        // Creating 3 car objects
        Car car1 = new Car("Car1", "BrandA", 2005, "Red");
        Car car2 = new Car("Car2", "BrandB", 2010, "Blue");
        Car car3 = new Car("Car3", "BrandC", 2015, "Black");

        // Starting all 3 cars
        car1.start();
        car2.start();
        car3.start();

        // Stopping only 1 car
        car1.stop();

        // Modifying 2nd car to green color
        car2.modify("Green");

        // Printing the expiry of 3rd car
        System.out.println("Expiry of Car3: " + car3.expiry());

        // Printing details of all 3 cars
        car1.detail();
        car2.detail();
        car3.detail();
    }
}
