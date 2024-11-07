package day.four;

import javax.tools.ForwardingFileObject;

public class TaskLoop {
    public static void main(String[] args) {
        forToTen();
        forEachArray();
        whileSumOfHundred();
        forEvenToTwenty();
        multiplicationTableSeven();
    }

    public static void forToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void forEachArray() {
        String[] brand = {"Ford", "Honda", "Audi"};
        for (String output : brand) {
            System.out.println(output);
        }
    }

    public static void whileSumOfHundred() {
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i++;
            sum += i;
        }
        System.out.println(sum);
    }

    public static void forEvenToTwenty() {
        for (int even = 2; even <= 20; even += 2) {
            System.out.println(even);
        }
    }

    public static void multiplicationTableSeven() {
        int seven = 7;
        for (int i = 1; i <= 10; i++) {
            int multi = i * seven;
            System.out.println(seven + " x " + i + " = " + multi);
        }
    }
}