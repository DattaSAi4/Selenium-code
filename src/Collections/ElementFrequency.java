package Collections;

import java.util.HashMap;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4,  4};

        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and count the occurrences
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else { 
                frequencyMap.put(element, 1);
            }
        }

        // Print the frequency of each element
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}