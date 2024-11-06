package DayThree;

import java.util.Arrays;

public class DataArray {
    public static void main(String[] args) {
        int []empty = new int[10];
        System.out.println(Arrays.toString(empty));
        int []numbers = {2, 4, 6};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]);

        Integer num = null;
        Boolean x = null;

        String[] one = {"a", "b", "c"};
        String[] two = {"d", "e", "f"};
        String[] sort = {"g", "e", "a", "f"};
        System.out.println(one[0] + "" + two[2]);

        one[0] = "1";
        System.out.println(Arrays.toString(one));
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
    }
}