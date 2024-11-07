package day.four;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
        arrayLength();
        incrementArrayElement();
        arrayElementAddition();
        arrayElementSubtraction();
    }

    public static void arrayLength() {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        int length = arr.length;
        System.out.println("Array Length is " + length);
    }

    public static void incrementArrayElement() {
        int[] arr = {1, 2, 3};
        arr[1]++;
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayElementAddition() {
        int[] arr = {1, 2, 3};
        arr[1] = arr[1] + 3;
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayElementSubtraction() {
        int[] arr = {1, 2, 3};
        arr[1] = arr[1] - 1;
        System.out.println(Arrays.toString(arr));
    }
}