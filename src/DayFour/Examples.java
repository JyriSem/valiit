package DayFour;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int length = arr.length;
        arr[1]++;
        System.out.println(length);
        System.out.println(arr[1]);
        arr[1] = arr[1] + 3;
        System.out.println(arr[1]);

        arr[1] = arr[1] - 1;
        System.out.println(Arrays.toString(arr));
    }
}