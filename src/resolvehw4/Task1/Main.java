package resolvehw4.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Andrii Shevchenko",47));
        users.add(new User(2,"Serhii Rebrov",50));
        users.add(new User(3,"Oleksandr Shovkovskyi",48));
        users.add(new User(4,"Andrii Yarmolenko",34));
        users.add(new User(5,"Mykhailo Mudryk",23));
        users.add(new User(6,"Andrii Lunin",25));
        users.add(new User(7,"Oleksandr Zinchenko",27));
        users.add(new User(8,"Georgii Sudakov",21));
        users.add(new User(9,"Vitalii Mykolenko",25));
        users.add(new User(10,"Taras Stepanenko",35));


        System.out.println("List of users - sorted by age ASC:");
        users.sort(Comparator.comparingInt(User::getAge));
        users.forEach(System.out::println);

        System.out.println("List of users - sorted by age DESC:");
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        users.forEach(System.out::println);

        System.out.println("List of users - sorted by name length ASC:");
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        users.forEach(System.out::println);

        System.out.println("List of users - sorted by name length DESC:");
        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        users.forEach(System.out::println);

    }
}
