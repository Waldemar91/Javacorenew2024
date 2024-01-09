package resolvehw2.Task2;

import resolvehw2.Task2.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PC {
    private String name;
    private Type type;
    private String processor;

    public void work () {
        System.out.println("PC work!");
    }
}