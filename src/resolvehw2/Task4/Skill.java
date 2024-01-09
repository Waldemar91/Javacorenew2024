package resolvehw2.Task4;

import resolvehw2.Task4.enums.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    Skills name;
    int exp;
}