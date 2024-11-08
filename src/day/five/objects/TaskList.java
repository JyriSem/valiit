package day.five.objects;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    public static void main(String[] args) {
//        removedEqualSign();
//        soso();
        removeElementsFromList();

    }

    private static void soso() {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding numbers to the list
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Attempting to remove even numbers
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }

    private static void removedEqualSign() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

//        for (int i = 0; i <= numbers.size(); i++) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
    }

    public static void removeElementsFromList() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
//        for (int i = numbers.size(); i >= 0; i--) {
        for (int i = numbers.size(); i == 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println("List after removing even numbers: " + numbers);
    }
}