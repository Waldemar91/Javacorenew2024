package resolvehw3.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Drum(21.5));
        instruments.add(new Trumpet(0.25));

        System.out.println("--------------");
        System.out.println("instruments:"+ instruments);

        System.out.println("--------------");
        System.out.println("Calling method play() for each instrument:");
        instruments.forEach(instrument -> instrument.play());
    }
}
