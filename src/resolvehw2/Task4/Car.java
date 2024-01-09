package resolvehw2.Task4;

import resolvehw2.Task4.enums.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import resolvehw2.Task4.enums.Models;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Models model;
    private int year;
    private int power;
}