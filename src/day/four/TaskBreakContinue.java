package day.four;

import java.util.Arrays;

public class TaskBreakContinue {
    public static void main(String[] args) {
        arrayFirstEven();
        oddNumbersSkipMultipliesOfFives();
        multipliesOfThreeSkipSix();
        arraySumStopAtNegative();
        arrayFindFirstGreaterThanFifty();
    }

    private static void arrayFirstEven() {
        int[] numbers = {1, 3, 7, 4, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Array " + Arrays.toString(numbers) + " first even number is " + number);
                break;
            }
        }
    }

    private static void oddNumbersSkipMultipliesOfFives() {
        int five = 5;
        int twenty = 20;
        for (int i = 1; i <= twenty; i += 2) {
            if (i % five == 0) {
                continue;
            }
            System.out.println("Odd numbers from 1 to " + twenty + ", skip multiplies of " + five + " = " + i);
        }
    }

    private static void multipliesOfThreeSkipSix() {
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

    private static void arraySumStopAtNegative() {
        int sum = 0;
        int[] numbers = {5, 12, 3, 7, -4, 8, 2};
        for (int number : numbers) {
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }

    private static void arrayFindFirstGreaterThanFifty() {
        int fifty = 50;
        int[] numbers = {23, 45, 39, 51, 48, 60};
        for (int number : numbers) {
            if (number > fifty) {
                System.out.println(number);
                break;
            }
        }
    }
}