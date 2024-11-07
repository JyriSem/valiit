package day.four;

import java.util.Arrays;

public class TaskBreakContinue {
    public static void main(String[] args) {
        firstEven();
        oddToTwentySkipMultipliesOfFives();
        multipiesOfThreeSkipMultipliesOfSix();
    }

    private static void firstEven() {
        int[] numbers = {1, 3, 7, 4, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Array " + Arrays.toString(numbers) + " first even number is " + number);
                break;
            }
        }
    }

    private static void oddToTwentySkipMultipliesOfFives() {
        int five = 5;
        int twenty = 20;
        for (int i = 1; i <= twenty; i += 2) {
            if (i % five == 0) {
                continue;
            }
            System.out.println("Odd numbers from 1 to " + twenty + ", skip multiplies of " + five + " = " + i);
        }
    }

    private static void multipiesOfThreeSkipMultipliesOfSix() {
        int three = 3;
        int six = 6;
        int thirty = 30;
        for (int i = three; i <= thirty; i += three) {
            if (i % six == 0) {
                continue;
            }
            System.out.println("Multiplies of " + three + " up to " + thirty + ", skip multiplies of " + six + " = " + i);
        }
    }
}