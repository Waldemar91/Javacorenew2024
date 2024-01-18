package resolvehw5.Task1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHomework {
    public static void main(String[] args) {
        // Create an ArrayList of words with 15-20 items
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");
        words.add("watermelon");
        words.add("strawberry");
        words.add("blueberry");
        words.add("pineapple");
        words.add("mango");
        words.add("papaya");
        words.add("kiwi");
        words.add("lime");
        words.add("lemon");
        words.add("coconut");
        words.add("apricot");
        words.add("peach");
        words.add("plum");
        words.add("cherry");
        words.add("fig");

        // Sort the ArrayList alphabetically
        Collections.sort(words);

        // Filter words with a length of less than 4 characters
        ArrayList<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() <= 4) {
                filteredWords.add(word);
            }
        }

        // Print the filtered ArrayList
        System.out.println(filteredWords);
    }
}
