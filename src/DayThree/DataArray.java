package DayThree;

import java.util.Arrays;

public class DataArray {
    public static void main(String[] args) {
        emptyArray();
        arrayAndIndexValue();
        nullValues();
        addAndReplaceTwoArrayIndexedValues();
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

    public static void addAndReplaceTwoArrayIndexedValues() {
        String[] one = {"a", "b", "c"};
        String[] two = {"d", "e", "f"};
        System.out.println(one[0] + " + " + two[2]);
        one[0] = "1";
        System.out.println(Arrays.toString(one));
    }

    public static void arraySorting() {
        String[] sort = {"g", "e", "a", "f"};
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
    }
}