package week03.oop.principles.inheritance.example03;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Audi", "Q8",2023);
        vehicle.start();
        System.out.println(vehicle.brand+"\n"
                + vehicle.model+"\n"
                + vehicle.year);
        vehicle.stop();
        System.out.println("#####################################");

        Car car= new Car(6);
        car.start();
        System.out.println(car.numDoors);
        car.stop();
        System.out.println("#####################################");

        Motorcycle motorcycle= new Motorcycle(false);
        motorcycle.start();
        System.out.println(motorcycle.hasSidecar);
        motorcycle.stop();
        System.out.println("#####################################");

        Truck truck= new Truck(800);
        truck.start();
        System.out.println(truck.cargoCapacity);
        truck.stop();




    }
}
