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
                new Car("Toyota", 150, new Owner("Alice", 20, 3), 25000, 2020));
//                new Car("Honda", 180, new Owner("Bob", 30, 5), 30000, 2019));
//                new Car("Ford", 200, new Owner("Charlie", 25, 2), 35000, 2018));
//                new Car("Nissan", 160, new Owner("David", 40, 8), 28000, 2021));

    }
}
