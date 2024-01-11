package resolvehw3.Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Printable> printableList = new ArrayList<>();

        printableList.add(new Book(1994, Publisher.MACMILLAN));
        printableList.add(new Book(1991, Publisher.SCHOLASTIC));
        printableList.add(new Book(2013,Publisher.PEARSON));
        printableList.add(new Magazine(31, Language.UKR));
        printableList.add(new Magazine(55, Language.ENG));

        System.out.println("------------");
        System.out.println("List of objects with type Printable: " + printableList);

        System.out.println("------------");
        System.out.println("Calling method print() for each object:");

        printableList.forEach(printable -> printable.print());
    }
}