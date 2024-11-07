package day.three;

import java.util.Arrays;

public class DataArray {
    public static void main(String[] args) {
        emptyArray();
        arrayAndIndexValue();
        nullValues();
        addTwoArraysIndexedValues();
        replaceArrayValue();
        arraySorting();
    }

    public static void emptyArray() {
        int[] empty = new int[10];
        System.out.println(Arrays.toString(empty));
    }

    public static void arrayAndIndexValue() {
        int[] numbers = {2, 4, 6};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]);
    }

    public static void nullValues() {
        Integer num = null;
        Boolean x = null;
    }

    public static void addTwoArraysIndexedValues() {
        String[] firstHalf = {"a", "b", "c"};
        String[] secondHalf = {"d", "e", "f"};
        System.out.println(firstHalf[0] + " + " + secondHalf[2]);
    }

    public static void replaceArrayValue() {
        String[] replace = {"g", "h", "i"};
        replace[0] = "G";
        System.out.println(Arrays.toString(replace));
    }

    public static void arraySorting() {
        String[] sort = {"g", "e", "a", "f"};
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
    }
}