package resolvehw4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Victory");
        words.add("Goal");
        words.add("Team");
        words.add("Athlete");
        words.add("Championship");
        words.add("Score");
        words.add("Competition");
        words.add("Stadium");
        words.add("Fitness");
        words.add("Coach");
        words.add("Referee");
        words.add("Training");
        words.add("Sportsmanship");
        words.add("Fan");
        words.add("Exercise");
        words.add("Tournament");
        words.add("Pitch");
        words.add("Sprint");
        words.add("Strategy");
        words.add("Athleticism");

        System.out.println("List of words - sorted by alphabet ASC:");

        words.sort(String::compareTo);
        words.forEach(System.out::println);
    }
}

