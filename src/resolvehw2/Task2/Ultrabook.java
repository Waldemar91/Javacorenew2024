package resolvehw2.Task2;

import resolvehw2.Task2.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ultrabook extends Laptop {
    private String destination;

    public Ultrabook(String name, Type type, String processor, float weight, float screen, String destination) {
        super(name, type, processor, weight, screen);
        this.destination = destination;
    }

    @Override
    public void work() {
        System.out.println("Ultrabook work!");
    }
}