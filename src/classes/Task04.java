package classes;

import java.util.Scanner;

public class Task04 {
    public void main(String[] args) {
        Vehicle.Engine engine = new Vehicle.Engine(200);
        Vehicle car = new Vehicle("BMW", "X5", engine, 200);

        System.out.println("Initial fuel: " + car.getFuel());
        car.drive(10);
        System.out.println("Fuel after driving: " + car.getFuel());
        car.drive(50);
        System.out.println("Fuel after attempting to drive with too much fuel loss: " + car.getFuel());
    }

    public class Vehicle {
        private String make;
        private String model;
        private Engine engine;
        private int fuel;

        public Vehicle(String make, String model, Engine engine, int fuel) {
            this.make = make;
            this.model = model;
            this.engine = engine;
            this.fuel = fuel;
        }

        public void drive (int consumption) {
            if (this.fuel > consumption) {
                this.fuel -= consumption;
            } else System.out.println("Fuel is not enough");
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine;
        }

        public int getFuel() {
            return fuel;
        }

        public static class Engine {
            private int power;

            public Engine(int power) {
                this.power = power;
            }

            public int getPower() {
                return power;
            }

            public void setPower(int power) {
                this.power = power;
            }
        }
    }


}
