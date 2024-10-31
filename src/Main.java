public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("01", "Audi", "A4 Limousine", 90.0);
        Car car2 = new Car("02", "Honda", "Accord", 70.0);
        Car car3 = new Car("03", "Mercedes", "E220", 150.0);
        Car car4 = new Car("04", "Volkswagen", "Golf 8", 60.0);
        Car car5 = new Car("05", "Volkswagen", "Passat B8", 60.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);
        rentalSystem.addCar(car4);
        rentalSystem.addCar(car5);

        rentalSystem.menu();
    }

    }
