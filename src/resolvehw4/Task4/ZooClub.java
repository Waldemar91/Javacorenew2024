package resolvehw4.Task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooClub {

    private Map<Person, List<Pet>> club = new LinkedHashMap<>();

    public void addPerson(Person person) {
        club.put(person, new ArrayList<>());
    }
}

