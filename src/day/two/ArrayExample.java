package day.two;

public class ArrayExample {
    public static void main(String[] args) {
        stringConcatenation();
        charAt();
        arrayOutput();
    }

    public static void stringConcatenation() {
        String firstPart = "ho";
        String secondPart = "ned";
        String full = firstPart.concat(secondPart);
        System.out.println("Concatenating " + firstPart + " to " + secondPart + " = " + full);
    }

    public static void charAt() {
        int indexOne = 1;
        String stringValue = "things";
        char character = stringValue.charAt(indexOne);
        System.out.println("String " + stringValue + " has a character " + character + " on position " + indexOne);
    }

    private static void arrayOutput() {
        char[] charData = {'a', 'b', 'c'};
        String output = new String(charData);
        System.out.println("Array contains " + output);
    }
}