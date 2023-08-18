package Constructor;

public class Car {
    String brand;
    String model;

    int year;

    public Car() {
        brand = "Bilinmeyen";
        model = "Bilinmeyen";
        year = 0;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println("Araba 1 : " + car1.brand + ", " + car1.model+ "," + car1.year);

        Car car2 = new Car("Toyota", "Coralla", 2022);
        System.out.println("Araba 2 : " + car2.brand+ ", " + car2.model + " , " + car2.year);
    }
}
