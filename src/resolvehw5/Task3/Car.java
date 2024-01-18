package resolvehw5.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private int enginePower;
    private Owner owner;
    private int price;
    private int yearOfManufacture;

    // Constructor and getters/setters
}