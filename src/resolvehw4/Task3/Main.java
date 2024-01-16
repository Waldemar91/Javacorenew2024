package resolvehw4.Task3;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        /* Creating a list of users*/
        List<User> users = new ArrayList<>();

        users.add(new User(
                1,
                "Ervin",
                "Howell",
                "Shanna@melissa.tv",
                28,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 3),
                        new Skill("js", 10)),
                new Car("audi", 2010, 200)
        ));

        users.add(new User(
                2,
                "Ervin",
                "Howell",
                "Shanna@melissa.tv",
                29,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 5),
                        new Skill("js", 10)),
                new Car("audi", 2010, 200)
        ));
        users.add(new User(
                3,
                "Clementine",
                "Bauch",
                "Nathan@yesenia.net",
                43,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 11),
                        new Skill("java", 13)),
                new Car("renault", 2006, 125)
        ));

        users.add(new User(
                4,
                "Patricia",
                "Lebsack",
                "Julianne.OConner@kory.org",
                24,
                Gender.FEMALE,
                Arrays.asList(new Skill("js", 2)),
                new Car("honda", 2008, 133)
        ));

        users.add(new User(
                5,
                "Chelsey",
                "Dietrich",
                "Lucio_Hettinger@annie.ca",
                39,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 5),
                        new Skill("java", 10)),
                new Car("skoda", 2004, 150)
        ));

        users.add(new User(
                6,
                "Dennis",
                "Schulist",
                "Karley_Dach@jasper.info",
                19,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 1),
                        new Skill("js", 1)),
                new Car("toyota", 2020, 220)
        ));

        users.add(new User(
                7,
                "Kurtis",
                "Weissnat",
                "Telly.Hoeger@billy.biz",
                47,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("python", 6),
                        new Skill("js", 9)),
                new Car("suzuki", 2004, 121)
        ));

        users.add(new User(
                8,
                "Nicholas",
                "Runolfsdottir",
                "Sherwood@rosamond.me",
                35,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 9),
                        new Skill("js", 10)),
                new Car("jaguar", 2015, 350)
        ));

        users.add(new User(
                9,
                "Glenna",
                "Reichert",
                "Chaim_McDermott@dana.io",
                38,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("java", 9),
                        new Skill("js", 10)),
                new Car("toyota", 2016, 180)
        ));
        users.add(new User(
                10,
                "Nicholas",
                "Runolfdottir",
                "Sherwood@rosamond.me",
                35,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 7),
                        new Skill("js", 10)),
                new Car("jaguar", 2015, 350)
        ));
        /* Creating a HashSet based on a list of users */
        Set<User> userHashSet = new HashSet<>(users);

        /* Removing users with the gender MALE */
        userHashSet.removeIf(user -> user.getGender().equals(Gender.MALE));

        /* Display results */
        System.out.println("HashSet of \"not MALE\" users:");
        userHashSet.forEach(System.out::println);

        /* Creating a TreeSet based on a list of users */
        Set<User> userTreeSet = new TreeSet<>(users);

        /* Sort by number of skills and display results */
        System.out.println("TreeSet of users sorted by number of skills:");
        userTreeSet.stream()
                .sorted(Comparator.comparingInt(o -> o.getSkills().size()))
                .forEach(System.out::println);
    }
}
