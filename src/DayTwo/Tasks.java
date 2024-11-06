package DayTwo;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        Scanner inputInt = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstInput = inputInt.nextInt();
        System.out.print("Please enter second number: ");
        int secondInput = inputInt.nextInt();
        System.out.print("Please enter third (even or odd) number: ");
        int thirdInput = inputInt.nextInt();
        Scanner inputString = new Scanner(System.in);
        System.out.print("Text: ");
        String fourthInput = inputString.nextLine();

        int multiplication = firstInput * secondInput;

        if (secondInput == 0) {
            System.out.println("ZERO!");
        } else {
            int division = firstInput / secondInput;
            System.out.println(firstInput + " / " + secondInput + " = " + division);
        }
        /*
        double result = 0.0 / 0.0;
        if (Double.isNaN(result)) {
            System.out.println("Result is NaN");
        }
        */
        int addition = firstInput + secondInput;
        int subtraction = firstInput - secondInput;

        System.out.println(firstInput + " * " + secondInput + " = " + multiplication);
        System.out.println(firstInput + " + " + secondInput + " = " + addition);
        System.out.println(firstInput + " - " + secondInput + " = " + subtraction);

        if (thirdInput % 2 == 0) {
            System.out.println("Number " + thirdInput + " is even number");
        } else {
            System.out.println("Number " + thirdInput + " is odd number");
        }

        if (firstInput > secondInput && firstInput > thirdInput) {
            System.out.println(firstInput + " is the greatest!");
        } else if (secondInput > firstInput && secondInput > thirdInput) {
            System.out.println(secondInput + " is the greatest!");
        } else {
            System.out.println(thirdInput + " is the greatest!");
        }

        String upper = fourthInput.toUpperCase();
        String lower = fourthInput.toLowerCase();
        boolean contains = fourthInput.contains("world");
        char firstChar = fourthInput.charAt(0);
        String replaceChar = fourthInput.replaceAll("(?i)o", "a");
        boolean startAndEnd = (fourthInput.startsWith("hello") && fourthInput.endsWith("world"));
        String startEndIndex = fourthInput.substring(7, 12);

        char occurredChar = 'o';
        int firstOccurrence = fourthInput.indexOf(occurredChar);
        int lastOccurrence = fourthInput.lastIndexOf(occurredChar);

        String regex = "(?i)hello";
        String replacement = fourthInput.replaceAll(regex, "bye" );

        System.out.println(fourthInput + " to uppercase, result is " + upper);
        System.out.println(fourthInput + " to lowercase, result is " + lower);
        System.out.println(fourthInput + " contains 'world', result is " + contains);
        System.out.println(fourthInput + " first character is " + firstChar);
        System.out.println(fourthInput + " replace 'o' with 'a', result is " + replaceChar);
        System.out.println(fourthInput + " starts with 'hello' and ends with 'world', result is " + startAndEnd);
        System.out.println(fourthInput + " start index '7', end index '12', result is " + startEndIndex);
        System.out.println(fourthInput + " char 'o' first occurrence at " + firstOccurrence + " and last occurrence at " + lastOccurrence);
        System.out.println(fourthInput + " replace 'hello' with 'bye', result is " + replacement);
    }
}