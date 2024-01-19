package resolvehw5.Task3;
import java.util.Arrays;
import java.util.List;

public class CarHomework {

    public static void main(String[] args) {
        List<Car> cars = createCars();

        // Engine repairs
        cars.stream().limit(cars.size() / 2)
                .forEach(car -> car.setEnginePower((int) (car.getEnginePower() * 1.1)));

        // Driver experience check and refresher courses
        cars.forEach(car -> {
            Owner owner = car.getOwner();
            if (owner.getDrivingExperience() < 5 && owner.getAge() > 25) {
                owner.setDrivingExperience(owner.getDrivingExperience() + 1);
            }
        });

        // Calculate total cost of cars
        int totalCost = cars.stream().mapToInt(Car::getPrice).sum();
        System.out.println("Total cost of all cars: " + totalCost);
    }

    private static List<Car> createCars() {
        return Arrays.asList(
                new Car("Toyota", 150, new Owner("Alice", 20, 3), 25000, 2020),
                new Car("Honda", 180, new Owner("Bob", 30, 5), 30000, 2019),
                new Car("Ford", 200, new Owner("Charlie", 25, 2), 35000, 2018),
                new Car("Mazda", 170, new Owner("Eve", 28, 4), 32000, 2022),
                new Car("Volkswagen", 190, new Owner("Fatima", 35, 6), 38000, 2017),
                new Car("Jeep", 220, new Owner("George", 50, 10), 42000, 2016),
                new Car("Chevrolet", 210, new Owner("Hannah", 22, 1), 34000, 2023),
                new Car("Subaru", 185, new Owner("Ian", 45, 9), 29000, 2020),
                new Car("Kia", 175, new Owner("Jasmine", 32, 7), 36000, 2019),
                new Car("Hyundai", 205, new Owner("Kevin", 60, 15), 40000, 2015),
                new Car("Peugeot", 180, new Owner("Laura", 27, 3), 30000, 2018),
                new Car("Mercedes-Benz", 230, new Owner("Mike", 55, 12), 45000, 2014),
                new Car("Audi", 225, new Owner("Nancy", 48, 8), 39000, 2016),
                new Car("BMW", 215, new Owner("Oliver", 38, 5), 37000, 2017),
                new Car("Nissan", 160, new Owner("David", 40, 8), 28000, 2021));

    }
}
