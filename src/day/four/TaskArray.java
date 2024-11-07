package day.four;

import java.util.Arrays;

public class TaskArray {
    public static void main(String[] args) {
        fullArray();
        specificElementArray();
        modifiedElement();
        arrayLength();
        arrayAddition();
    }

    public static void fullArray() {
        int fullArray[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(fullArray));
    }

    public static void specificElementArray() {
        int specificElementArray[] = {10, 20, 30, 40, 50};
        int thridElement = specificElementArray[2];
        System.out.println(thridElement);
    }

    public static void modifiedElement() {
        int modifiedElement[] = {10, 20, 30, 40, 50};
        modifiedElement[1] = 12;
        System.out.println(Arrays.toString(modifiedElement));
    }

    public static void arrayLength() {
        int arrayLength[] = {8, 6, 7, 5, 3, 0, 9};
        int arrayLengthValue = arrayLength.length;
        System.out.println(arrayLengthValue);
    }

    public static void arrayAddition() {
        int arrayAdd[] = {4, 2, 8, 1, 6};
        int arrayAddValue = arrayAdd[0] + arrayAdd[1] + arrayAdd[2] + arrayAdd[3] + arrayAdd[4];
        System.out.println(arrayAddValue);
    }
}