package resolvehw4.Task4;

public class Main {

    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        /* 1) додати учасника в клуб */
        Person person1 = new Person(1, "Andrii Kit ",19);
        Person person2 = new Person(2, "Maksym Kril",18);
        Person person3 = new Person(3, "Petro Zayats",20);

        zooClub.addPerson(person1);
        zooClub.addPerson(person2);
        zooClub.addPerson(person3);

        System.out.println("1) додати учасника в клуб:");
        zooClub.getClub().entrySet().forEach(System.out::println);
    }
}


