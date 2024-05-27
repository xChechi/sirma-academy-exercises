package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] carData = sc.nextLine().split(" ");
            if (carData.length > 1) {
                String brand = carData[0];
                String model = carData[1];
                int horsePower = Integer.parseInt(carData[2]);
                Car car = new Car(brand, model, horsePower);
                carList.add(car);
            } else {
                String brand = carData[0];
                Car car = new Car(brand);
                carList.add(car);
            }
        }

        for(Car car : carList) {
            System.out.println(car.carInfo());
        }
    }

    public static class Car {
        private String brand;
        private String model;
        private int horsePower;

        public Car (String brand, String model, int horsePower) {
            this.brand = brand;
            this.model = model;
            this.horsePower = horsePower;
        }

        public Car (String brand) {
            this.brand = brand;
            this.model = "unknown";
            this.horsePower = -1;
        }


        public String carInfo () {
            return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
}
